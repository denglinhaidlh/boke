<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>详情页</title>
<link href="css/sg.css" rel="stylesheet" type="text/css" />
<link href="css/teacher.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="header">
     <div class="wth1100">
          <div class="teac_pic"><a href="#"><img src="images/peple.jpg" alt=""/></a></div>
          <div class="teac_nr">
               <div class="teac_bt"><span>个人博文</span></div>
               <div class="teac_zi">我的肥猪流个性签名<br />
                西风吹老洞庭波<br />
               一夜湘君白发多<br />
              醉后不知天在水<br />
               满船清梦压星河<br />
              </div>
          </div>
          <div class="clearfix"></div>
     </div>     
</div>
<div id="container">
     <div class="detail_con">
          <div class="det_bt">关于中秋的那点事</div>
          <div class="det_sm">
               <div class="fl"><span>发表于：2014-8-28 23:56:03  作者：moon老师</span></div>
               <div class="fr">
               <a href="#"><i class="discuss teac_icon"></i><span>评论</span></a>
               <a href="#"><i class="forward teac_icon"></i><span>转发</span></a>
               <a href="#"><i class="praise teac_icon"></i><span>点赞</span></a>
               </div>
               <div class="clearfix"></div>
          </div>
          <div class="det_nr">一直想跟大家总结一下网站推广八大技巧，今天总算找到时间。以下八大技巧综合网站推广的8个不同的大型的推广计划，而类似友情链接推广、签名推广、论坛帖子推广等小型推广技巧没有罗列
在类，以下任何一种方法都能帮助网站获取大量流量，详细介绍如下：<br><br>

一、软文推广<br>
主要是软文投稿的方式，投稿的平台有很多，主要选择行和S就会把你留在投稿文站又会去阅读和扩展你的网站，所以这是一个病毒式的传播。<br>


二、QQ群推广<br>
关于QQ群推广有太多内容和步骤要讲，详细步骤可以参考：怎么利用QQ群推广网站。我在这里主要讲在QQ群里的推广方法：<br>
1、在群里建，然后群主在群里偶尔帮大家解答一两个问题，大家觉得群主非常厉害，会非常的
信任他。然后下一次一旦有人问就会把链接发出来给大家。这一点非常厉害，很多人就会去点击阅读，特别是这个行业的新手。<br>
另外，不仅如此他还能获取一些行业的内幕，比如那个地区这些信息放到网站上推广给大家。因为有内部资源，所以能获得更多人来网站地啊你。这个论
坛在建立后2个月就能主关键去外链，外链只有几十个，现在推广比较少，所以排名稍有下降。<br>

          <div id="message">
                <div class="mes_nr">
                <form action="reply.do?articleid=${sessionScope.articleid }" method="post">
                     <textarea name="content"  class="text_area"></textarea>
                     <div class="tongbu"><span>同步到：</span>
                     <a href="#" class="teac_icon xinlang"></a>
                     <a href="#" class="teac_icon tengxun"></a>
                     <a href="#" class="teac_icon renren"></a></div>
                     <div class="fabiao">
                     <input  type="submit" value="发表评论" />
                     </div >
                                       
                     <div class="clearfix"></div>
                     
                     </form>
                </div>
                <div class="mes_list">
                	
                	<c:forEach  var="a" items="${sessionScope.replylist}">
                     <div class="sort"><a href="#" class="current">按时间</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">按热门</a></div>
                     <div class="disc_list">
                          <div class="pic"><a href="#"><img src="images/pic.jpg" width="43" height="43" /></a></div>
                          
                          
                          <div class="liuyan1">
                               <dl>
                                   <dt>${a.username }</dt>
                                   <dd>${a.content }</dd>                                   
                               </dl>
                               <div class="pubdata">
                                    <span>发表于：${a.time } |</span>
                                    <a href="#" class="fl">只看该作者</a>
                                    <a href="#" class="fr"><span class="nolike teac_icon"></span><p>不喜欢(21)</p></a>
                                    <a href="#" class="fr"><span class="onlike teac_icon"></span><p>喜欢(123)</p></a>
                               </div>
                          </div>
                          
                          <div class="clearfix"></div>
                          </c:forEach>
                     </div>
                     <div class="disc_list">
                          <div class="pic"><a href="#"><img src="images/img1.jpg" width="43" height="43" /></a></div>
                          <div class="liuyan1">
                               <dl>
                                   <dt>未来世界</dt>
                                   <dd>推荐你们去看一部电影，叫代理人，其实未来的世界就是那样的！推荐你们去看一部电影，叫代理人，其实未来的世界就是那样的！推荐你们去看一部电影，叫代理人，其实未来的世界就是那样的！推荐你们去看一部电影，叫代理人，其实未来的世界就是那样的！</dd>
                               </dl>
                               <div class="pubdata">
                                    <span>发表于：2014-9-05 19:13:48 |</span>
                                    <a href="#" class="fl">只看该作者</a>
                                    <a href="#" class="fr"><span class="nolike teac_icon"></span><p>不喜欢(3)</p></a>
                                    <a href="#" class="fr"><span class="onlike teac_icon"></span><p>喜欢(234)</p></a>
                               </div>
                          </div>
                          <div class="clearfix"></div>
                     </div>
                     
                     <div class="pagesize">
                          <ul>
                              <li><span>跳转到：</span><input name="" type="text" class="text_box" /><input name="" type="button" value="GO" class="text_btn" /></li>
                              <li><a href="#">下一页</a></li>
                              <li><a href="#">上一页</a></li>
                          </ul>                              
                     </div>
                     <div class="clearfix"></div>
                </div>
           </div>
     </div>
</div>
<div id="footer"><p>Copyright © 2013-2014 www.mooncollege.cn All Rights Reserved版权所有：湖南潭州教育咨询有限公司 备案号：备13016338号</p></div>
</body>
</html>
