import java.awt.*;

import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;

import org.jfree.chart.renderer.category.*;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.ui.*;
 

public class WeekOndo {
 
    public JFreeChart getChart(TakeXml xml,int weatherflag) {
       
    
        // 데이터 생성 
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();   // 최고
        DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();   // 최저
        // 데이터 입력 ( 값, 범례, 카테고리 )
        if(weatherflag==0){ // 일간데이터 
           double[] todaytemp = new double[8];
           String[] todayhour = new String[8];
           for(int i=0;i<8;i++){
           todaytemp[i] =Double.parseDouble(xml.getTemp()[i]);
           todayhour[i] = xml.getHour()[i];
        
           }
        // 그래프 3       
           for(int  j=0;j<8;j++)
              dataset2.addValue(todaytemp[j], "T1",todayhour[j]+"시");
        }
        
        else if(weatherflag==1){ // 주간데이터 
           int k=0;
           double[] weekhightemp = new double[7];
           double[] weeklowtemp = new double[7];
           int day=RealFrame.p0.bread.day;
           for(int i=0;i<7;i++){
           weekhightemp[i] =Double.parseDouble(xml.gethighTemp()[k]);
           weeklowtemp[i] =Double.parseDouble(xml.getlowTemp()[k]);
           k=k+2;
             }
           
           for(int  j=0;j<7;j++)
              dataset2.addValue(weekhightemp[j], "T1",(day+j)+"일");
           for(int  j=0;j<7;j++)
              dataset3.addValue(weeklowtemp[j], "T2",(day+j)+"일");
      
        }
        
        // 렌더링 생성 및 세팅
        // 렌더링 생성
     
        final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();//최고
        final LineAndShapeRenderer renderer3 = new LineAndShapeRenderer();//최저
       
        // 공통 옵션 정의
        final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
        final ItemLabelPosition p_center = new ItemLabelPosition(
                ItemLabelAnchor.CENTER, TextAnchor.CENTER
            );
        final ItemLabelPosition p_below = new ItemLabelPosition(
                     ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT
                     );
        Font f = new Font("Gulim", Font.BOLD, 14);
        Font axisF = new Font("Gulim", Font.PLAIN, 14);
       
        // 렌더링 세팅
        // 그래프 3       
        renderer2.setBaseItemLabelGenerator(generator);
        renderer2.setBaseItemLabelsVisible(true);
        renderer2.setBaseShapesVisible(true);
        renderer2.setDrawOutlines(true);
        renderer2.setUseFillPaint(true);
        renderer2.setBaseFillPaint(Color.red);
        renderer2.setBaseItemLabelFont(f);
        renderer2.setBasePositiveItemLabelPosition(p_below);
        renderer2.setSeriesPaint(0,new Color(100,10,10));
        renderer2.setSeriesStroke(0,new BasicStroke(
                                               2.0f,
                                               BasicStroke.CAP_ROUND,
                                               BasicStroke.JOIN_ROUND,
                                               3.0f)
        );
        
        renderer3.setBaseItemLabelGenerator(generator);
        renderer3.setBaseItemLabelsVisible(true);
        renderer3.setBaseShapesVisible(true);
        renderer3.setDrawOutlines(true);
        renderer3.setUseFillPaint(true);
        renderer3.setBaseFillPaint(Color.blue);
        renderer3.setBaseItemLabelFont(f);
        renderer3.setBasePositiveItemLabelPosition(p_below);
        renderer3.setSeriesPaint(0,new Color(144,229,119));
        
        renderer3.setSeriesStroke(0,new BasicStroke(
                                               2.0f,
                                               BasicStroke.CAP_ROUND,
                                               BasicStroke.JOIN_ROUND,
                                               3.0f)
        );
       
        // plot 생성
        final CategoryPlot plot = new CategoryPlot();
       
        // plot 에 데이터 적재
        plot.setDataset(2, dataset2);
        plot.setRenderer(2, renderer2);
        plot.setDataset(3, dataset3);
        plot.setRenderer(3, renderer3);

        // plot 기본 설정
        plot.setOrientation(PlotOrientation.VERTICAL);       // 그래프 표시 방향
        plot.setRangeGridlinesVisible(true);                         // X축 가이드 라인 표시여부
        plot.setDomainGridlinesVisible(true);                      // Y축 가이드 라인 표시여부
 
        // 렌더링 순서 정의 : dataset 등록 순서대로 렌더링 ( 즉, 먼저 등록한게 아래로 깔림 )
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
       
        // X축 세팅
        plot.setDomainAxis(new CategoryAxis());           // X축 종류 설정
        plot.getDomainAxis().setTickLabelFont(axisF); // X축 눈금라벨 폰트 조정
        plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD);       // 카테고리 라벨 위치 조정
 
        // Y축 세팅
        plot.setRangeAxis(new NumberAxis());              // Y축 종류 설정
        plot.getRangeAxis().setTickLabelFont(axisF);  // Y축 눈금라벨 폰트 조정
        
        final JFreeChart chart = new JFreeChart(plot);
        // 세팅된 plot을 바탕으로 chart 생성'
        if(weatherflag==0){ //일간데이터
           String CuWeather=xml.wfKor[0];
           chart.setTitle("일간 날씨( "+CuWeather+" )" );
        }
   
        if(weatherflag==1){ //주간데이터
           String CuWeather=xml.wfKor[0];
           chart.setTitle("주간 날씨 (T1=최고기온 , T2=최저기온)" );
        }
        
        return chart;
    }
}