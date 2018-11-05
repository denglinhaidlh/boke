<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.servlet.http.HttpServlet"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人博客</title>
<link href="css/sg.css" rel="stylesheet" type="text/css" />
<link href="css/teacher.css" rel="stylesheet" type="text/css" />
</head>

<body>
<!--<div id="music">
     <div class="play">
          <div class="advance"><a href="#" class="teac_icon"></a></div>
          <div class="pause"><a href="#" class="teac_icon start"></a><a href="#" class="teac_icon suspend" style="display:none;"></a></div>
          <div class="back"><a href="#" class="teac_icon"></a></div>
     </div>
     
</div>-->

<!--  <div id="header">
     <div class="wth1100">
          <div class="teac_pic"><a href="#"><img src="images/peple.jpg" alt=""/></a></div>
          <div class="teac_nr">
               <div class="teac_bt"><span>老师姓名</span></div>
               <div class="teac_zi">中共党员，本科学历，小学高级教师。长沙市小学语文优秀教师。<br />
               1995年参加湖南省小学语文教学比武，荣获一等奖的第一名，同年10月代表湖南省参加全国语文教学比武再获二等奖。<br />
               2005年——2007年多次代表学校担任省级，国家级观摩课的执教任务，并获得各级领导及专家们的一致好评。<br />
               2006年10月，作为语文学科带头人被学校派往昆明进行课题骨干培训，使自己的专业水平得以提升。撰写的经验论文多次获国家、省、市级一、二等奖。<br />
               2001年编写了《轻轻松松学作文》系列丛书，2003年参与编写《教学兵法》一书。<br />
               2008年担任《金典》多册练习册主编。所带班级班风正，学风浓，2007年被评为长沙市"红旗中队"。辅导学生习作参加各级各类比赛多次获特等奖及一、二等奖。</div>
          </div>
          <div class="clearfix"></div>
     </div>     
</div>  -->
<div id="container">
     <div class="con_left">
          <div class="conl_nr">
               <div class="time"><p>9月<br />8日</p></div>
               <div class="conl_bt"><a href="#">揭秘海量关键词排名策略</a></div>
               <div class="conl_zi"><p>优化网站要分析了解行情，在对网站做好基础定位之前，更重要的是在前期优化策略一定要对，海量的排名需要注意多个因素，如:关键词的分配、内容质量，需求类别的划化， 分词技术处理， (*^__^*)！</p></div>
               <div class="conl_btn">
                    <a class="btnbg discuss"><span class="teac_icon"></span><i>评论(12)</i></a>
                    <a class="btnbg forward"><span class="teac_icon"></span><i>转发(23)</i></a>
                    <a class="btnbg praise"><span class="teac_icon"></span><i>点赞(127)</i></a>
                    <a class="btnbg collect"><span class="teac_icon"></span><i>收藏</i></a>
                    <a href="#" class="fr">【我要关注该讲师】</a>
                    <div class="veiw"><span class="teac_icon"></span><p>653432</p></div>
                    <div class="clearfix"></div>
               </div>
               <div id="message" class="wth715">
                    <div class="mes_nr">
                     <form action="article.do?userid=${sessionScope.userid }" method="post">
                         <textarea name="articlecontent"  class="text_area"></textarea>
                         <div class="tongbu">
                         <span>同步到：</span><a href="#" class="teac_icon xinlang"></a>
                         <a href="#" class="teac_icon tengxun">
                         </a><a href="#" class="teac_icon renren"></a>
                         </div>
                         <input type="text" name="title"  placeholder="文章标题"/>                        
                         <div class="fabiao"><input  type="submit" value="发表文章" /></div>
                         <div class="clearfix"></div>
                         
                      </form>
                    </div>
                  
               </div>                              
          </div>
          
          <c:forEach  var="a" items="${sessionScope.articlelist}">
          <div class="conl_nr">
               <div class="time"><p> ${a.pub_date } </p></div>
               <div class="conl_bt"  ><a href="reply.do?articleid=${a.articleid }">${a.title }</a></div>
               <div class="conl_zi" ><p> ${a.content }</p>
               		<p><a href="detail.jsp"><img src="images/img1.jpg" width="550" height="384" /></a></p>
               </div>
              
               <div class="conl_btn">
                    <a class="btnbg discuss"><span class="teac_icon"></span><i>评论(12)</i></a>
                    <a class="btnbg forward"><span class="teac_icon"></span><i>转发(23)</i></a>
                    <a class="btnbg praise"><span class="teac_icon"></span><i>点赞(127)</i></a>
                    <a class="btnbg collect"><span class="teac_icon"></span><i>收藏</i></a>
                    <a href="#" class="fr">【我要关注该讲师】</a>
                    <div class="veiw"><span class="teac_icon"></span><p>653432</p></div>
                    <div class="clearfix"></div>
               </div>               
          </div>
           </c:forEach>
      
          
     </div>
     <div class="con_right">
          <div class="conr_bt">
               <div class="line"></div>
               <div class="zi">热门推荐</div>
               <div class="line"></div>
               <div class="clearfix"></div>
          </div>
          <div class="conr_nr">
               <div class="hot_list">
                    <div class="pic"><a href="#"><img src="images/pic.jpg" width="265" height="205" /></a></div>
                    <h3><a href="#">百度快速提权优化方法杀手锏</a></h3>
                    <p>页面得分越高，越利于关键词排名，而搜索引擎对于不同的网站，页面得分判断标准是会变的，所以在优化方式是要改变的，例如：从差异性的角度来做关键词排名+结合营销来增强用户投票，带动网站整体的权重，SEO研究中心创始人"Moon老师"分享"快速提权优化方法杀手锏"，十年行业经验，精彩与你分享，今晚8:30分YY6359频道欢迎收听！</p>
                    <div class="operate"><a href="#"><span class="veiw teac_icon"></span><i>41231</i></a><a href="#"><span class="discuss teac_icon"></span><i>345</i></a><a href="#"><span class="forward teac_icon"></span><i>57</i></a><a href="#"><span class="praise teac_icon"></span><i>345</i></a><div class="clearfix"></div></div>
               </div>
               <div></div>
          </div>
     </div>
     <div class="clearfix"></div>
</div>

<div id="footer"><p>Copyright © 2013-2014 www.mooncollege.cn All Rights Reserved</p></div>
</body>
</html>

