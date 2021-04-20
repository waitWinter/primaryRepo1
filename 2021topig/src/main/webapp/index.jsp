<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>2021给我超爱的猪</title>
    <link rel="stylesheet" href="css/hovertree.css" />
</head>
<body>
<div class="hovertreeinfo">
    <h2></h2>
</div>
<!-- 仅自动播放音乐 -->
<audio loop src="img/love.mp3" id="audio" autoplay preload="auto">该浏览器不支持audio属性</audio>
<script type="text/javascript">
    //--创建页面监听，等待微信端页面加载完毕 触发音频播放
    document.addEventListener('DOMContentLoaded', function () {
        function audioAutoPlay() {
            var audio = document.getElementById('audio');
            audio.play();
            document.addEventListener("WeixinJSBridgeReady", function () {
                audio.play();
            }, false);
        }
        audioAutoPlay();
    });
    //--创建触摸监听，当浏览器打开页面时，触摸屏幕触发事件，进行音频播放
    document.addEventListener('touchstart', function () {
        function audioAutoPlay() {
            var audio = document.getElementById('audio');
            audio.play();
        }
        audioAutoPlay();
    });
</script>

<!--/*外层最大容器*/-->
<div class="wrap">
    <!--	/*包裹所有元素的容器*/-->
    <div class="cube">
        <!--前面图片 -->
        <div class="out_front">
            <img src="img/img01.jpg " class="pic" />
        </div>
        <!--后面图片 -->
        <div class="out_back">
            <img src="img/img02.jpg" class="pic"/>
        </div>
        <!--左图片 -->
        <div class="out_left">
            <img src="img/img03.jpg" class="pic" />
        </div>
        <div class="out_right">
            <img src="img/img04.jpg" class="pic" />
        </div>
        <div class="out_top">
            <img src="img/img05.jpg" class="pic" />
        </div>
        <div class="out_bottom">
            <img src="img/img06.jpg" class="pic" />
        </div>
        <!--小正方体 -->
        <span class="in_front">
					<img src="img/img07.jpg" class="in_pic" />
				</span>
        <span class="in_back">
					<img src="img/img08.jpg" class="in_pic" />
				</span>
        <span class="in_left">
					<img src="img/img09.jpg" class="in_pic" />
				</span>
        <span class="in_right">
					<img src="img/img10.jpg" class="in_pic" />
				</span>
        <span class="in_top">
					<img src="img/img11.jpg" class="in_pic" />
				</span>
        <span class="in_bottom">
					<img src="img/img12.jpg" class="in_pic" />
				</span>
    </div>
</div>

</body>
</html>

