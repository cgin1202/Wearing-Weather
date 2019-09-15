/*
 * 프로그램 명 : 테이크 XML
 * 프로그램 작성자 : 공민철
 * 프로그램 작성일 : 2017/11/24
 * 프로그램 설명 : 기상청 rss정보를 가져와
 * xml 파싱을 수행하는 기능 클래스이다
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.*;
import java.awt.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class TakeXml
{
	public int locationNum = 0;
	public String locationName = new String();
	String[] day1 = new String[16];	//오늘 내일 모레
	String[] temp = new String[16];	//온도
	String[] wfEn = new String[16];	//날씨
	String[] wfKor = new String[16];//날씨 한국어
	String[] hour1 = new String[16];//시간
	String[] pop = new String[16];	//강수확률
	String[] tmx = new String[16];  //일최고기온
	String[] tmn = new String[16];	//일최저기온
	String[] r06 = new String[16];  //6시간 강수량
	
	
	/*			일주일 날씨			*/
	String[] tmEf = new String[14];			//2017-12-10 00:00
	String[] wf = new String[14];			//구름많고 비/눈
	String[] tmn_w = new String[14];		//최저온도
	String[] tmx_w = new String[14];		//최고온도
	
	
	String notConnected = new String("Not Connected"); //인터넷 연결 안되있을때
	public ClockTime clktm = new ClockTime();
	public int hour = clktm.hour;
	public int minute = clktm.minute;
	public int second = clktm.second;
	public int ampm = clktm.dd;

	private boolean FirstBar = false;
	private boolean SecondBar = false;
	
	private int firstK;
	private int lastK;
	
	
	Calendar hourtime = Calendar.getInstance();
	{

	try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilderFactory dbFactory_w = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder parser = dbFactory.newDocumentBuilder();
		DocumentBuilder parser_w = dbFactory_w.newDocumentBuilder();
		
		
		Document xmlDoc = null;
		Document xmlDoc_w = null;
		String[] url = {"http://web.kma.go.kr/wid/queryDFSRSS.jsp?zone=4311259000", //충북 청주 개신동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1174055000", //서울 강동구 고덕1동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4276025000",  //강원 평창군 평창읍
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2818582000",  //인천 연수구 송도1동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=3014053500",  //대전 중구 은행선화동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4413152000",   //천안시 동남구 문성동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4711132000",  //경남 포항시 남면 동해구
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2723067100",   //대구 북구 복현1동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2623071000",  //부산 부산진구 가야제1동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4511358000",   //전북 전주덕진구 금암1동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2914074500",  //광주광역시 서구 치평동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5011057000",  //제주 제주시 용담1동
				"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4794025000"  //경북 울릉군 울릉읍
		};
		String url_w = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109"; //전국 일주일 날씨
		
		switch(locationNum) {
		case 0:
			locationName = "청주";
			break;
		case 1:
			locationName = "서울";
			break;
		case 2:
			locationName = "평창";
			break;
		case 3:
			locationName = "인천";
			break;
		case 4:
			locationName = "대전";
			break;
		case 5:
			locationName = "천안";
			break;
		case 6:
			locationName = "포항";
			break;
		case 7:
			locationName = "대구";
			break;
		case 8:
			locationName = "부산";
			break;
		case 9:
			locationName = "전주";
			break;
		case 10:
			locationName = "광주";
			break;
		case 11:
			locationName = "제주";
			break;
		case 12:
			locationName = "울릉도";
			break;
		}
		xmlDoc = parser.parse(url[locationNum]);
		xmlDoc_w = parser_w.parse(url_w);
		
		
		Element root = xmlDoc.getDocumentElement();
		Element root_w = xmlDoc_w.getDocumentElement();
		
		for(int i = 0; i < temp.length; i++) {
			Node rootNode = root.getElementsByTagName("data").item(i);
			Node dayNode = ((Element)rootNode).getElementsByTagName("day").item(0);
			Node tempNode = ((Element)rootNode).getElementsByTagName("temp").item(0);
			Node wfEnNode = ((Element)rootNode).getElementsByTagName("wfEn").item(0);
			Node wfKorNode = ((Element)rootNode).getElementsByTagName("wfKor").item(0);
			Node hourNode = ((Element)rootNode).getElementsByTagName("hour").item(0);
			Node popNode = ((Element)rootNode).getElementsByTagName("pop").item(0);
			Node r06Node = ((Element)rootNode).getElementsByTagName("r06").item(0);
			
			day1[i] = dayNode.getTextContent();
			temp[i] = tempNode.getTextContent();
			wfEn[i] = wfEnNode.getTextContent();
			wfKor[i] = wfKorNode.getTextContent();
			pop[i] = popNode.getTextContent();
			hour1[i] = hourNode.getTextContent();
			r06[i] = r06Node.getTextContent();
		}
		try {
		for(int i = 0; i < tmEf.length; i++) {
			Node rootNode = root_w.getElementsByTagName("data").item(i);
			Node tmEfNode = ((Element)rootNode).getElementsByTagName("tmEf").item(0);
			Node wfNode = ((Element)rootNode).getElementsByTagName("wf").item(0);
			Node tmnNode = ((Element)rootNode).getElementsByTagName("tmn").item(0);
			Node tmxNode = ((Element)rootNode).getElementsByTagName("tmx").item(0);
			
			tmEf[i] = tmEfNode.getTextContent();
			wf[i] = wfNode.getTextContent();
			tmn_w[i] = tmnNode.getTextContent();
			tmx_w[i] = tmxNode.getTextContent();
			
			
		}
		}catch(Exception e) {
			System.out.println("Week Not");
		}
		
	}catch(Exception e) {
		System.out.println(notConnected);
		temp[0] = notConnected;
	}
	
    }
	public String getDay(int k) {
		//System.out.println(day1[k]);
		if(day1[k] == "0")
			return "오늘";
		else if(day1[k] == "1")
			return "내일";
		else
			return "모레";
	}
	public String[] getR06() {
		return r06;
	}
	public String[] getTemp() {
		return temp;
	}
	public String[] getEn() {
		return wfEn;
	}
	public String[] getHour() {
		return hour1;
	}
	public String[] getPop() {
		return pop;
	}
	public int thisHour() {
		return hourtime.get(Calendar.HOUR_OF_DAY);
	}
	public String[] gethighTemp(){
	    return tmx_w;
	}
	public String[] getlowTemp(){
		return tmn_w;
	}
	
	public void CreateData() {
		try {
			System.out.println("nice");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = dbFactory.newDocumentBuilder();
			
			Document xmlDoc = null;
			String[] url = {"http://web.kma.go.kr/wid/queryDFSRSS.jsp?zone=4311259000", //충북 청주 개신동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1174055000", //서울 강동구 고덕1동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4276025000",  //강원 평창군 평창읍
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2818582000",  //인천 연수구 송도1동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=3014053500",  //대전 중구 은행선화동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4413152000",   //천안시 동남구 문성동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4711132000",  //경남 포항시 남면 동해구
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2723067100",   //대구 북구 복현1동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2623071000",  //부산 부산진구 가야제1동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4511358000",   //전북 전주덕진구 금암1동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2914074500",  //광주광역시 서구 치평동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5011057000",  //제주 제주시 용담1동
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4794025000"  //경북 울릉군 울릉읍
			};
			switch(locationNum) {
			case 0:
				locationName = "청주";
				break;
			case 1:
				locationName = "서울";
				break;
			case 2:
				locationName = "평창";
				break;
			case 3:
				locationName = "인천";
				break;
			case 4:
				locationName = "대전";
				break;
			case 5:
				locationName = "천안";
				break;
			case 6:
				locationName = "포항";
				break;
			case 7:
				locationName = "대구";
				break;
			case 8:
				locationName = "부산";
				break;
			case 9:
				locationName = "전주";
				break;
			case 10:
				locationName = "광주";
				break;
			case 11:
				locationName = "제주";
				break;
			case 12:
				locationName = "울릉도";
				break;
			}
			xmlDoc = parser.parse(url[locationNum]);
			
			Element root = xmlDoc.getDocumentElement();
			for(int i = 0; i < temp.length; i++) {
				Node rootNode = root.getElementsByTagName("data").item(i);
				Node dayNode = ((Element)rootNode).getElementsByTagName("day").item(0);
				Node tempNode = ((Element)rootNode).getElementsByTagName("temp").item(0);
				Node wfEnNode = ((Element)rootNode).getElementsByTagName("wfEn").item(0);
				Node wfKorNode = ((Element)rootNode).getElementsByTagName("wfKor").item(0);
				Node hourNode = ((Element)rootNode).getElementsByTagName("hour").item(0);
				Node popNode = ((Element)rootNode).getElementsByTagName("pop").item(0);
				Node r06Node = ((Element)rootNode).getElementsByTagName("r06").item(0);
				
				day1[i] = dayNode.getTextContent();
				temp[i] = tempNode.getTextContent();
				wfEn[i] = wfEnNode.getTextContent();
				wfKor[i] = wfKorNode.getTextContent();
				pop[i] = popNode.getTextContent();
				hour1[i] = hourNode.getTextContent();
				r06[i] = r06Node.getTextContent();
			}
		}catch(Exception e) {System.out.println("Error!");}
	}
	
	public void SetLocation(int num) {
		locationNum = num;
		CreateData();
	}
}
