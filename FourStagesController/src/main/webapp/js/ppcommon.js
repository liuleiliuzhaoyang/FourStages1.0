// JavaScript Document
$(document).ready(function(e) {
	setInterval(GetWindowWidth,10);
});
function GetWindowWidth(){
	var w=$(window).width();
	$(".bd").css("width",w+"px");
	if (w < 1920){
	   $(".bd ul").css({"left":(w-1920)/2+"px"});
	   }else{
		$(".bd ul").css({"left":0+"px"});
	}
}
// 首页弹窗登陆
$(function(){
	$(".btn_login").click(function(){
        $(".landing").slideDown(200)
      });
      $(".login-close").click(function(){
        $(".landing").slideUp(200)
      }); 
})
//投资统计选项卡切换特效
$(function(){
	$(".touzi-tj-tab-ul ul li").click(function(){
		$(this).addClass('l-hover').siblings().removeClass('l-hover');
	})
	$(".l-tab-l").click(function(){
		$(".touzi-tj-show").css("display","block");
		$(".touzi-tj-hide").css("display","none");
	})
	$(".l-tab-r").click(function(){
		$(".touzi-tj-hide").css("display","block");
		$(".touzi-tj-show").css("display","none");
	})
})
//自动投标-切换
$(function(){
	$(".touzi-tb-middle-con").click(function(){
		$(this).addClass("m-hover").siblings().removeClass("m-hover");
		$(this).find(".touzi-tb-middle-btm-ico").css("display","block").parent().siblings().find(".touzi-tb-middle-btm-ico").css("display","none");
	})
})
// 返回顶部
$(function(){
	var $goTop=$(".p_rt_gotop");
	$goTop.hide();
	$(window).scroll(function(){
		if($(window).scrollTop()>100){
			$goTop.show();
		}else{
			$goTop.hide();
		}
	})
	$goTop.click(function(){
		var scrollTop=$(window).scrollTop();
		goTop(scrollTop);
	});
	function goTop(num){
		var timeid;
		timeid=setInterval(function(){
			if(num>0){
				num-=50;
				$(window).scrollTop(num);
			}else{
				clearInterval(timeid);
			}
		},10);
	}
})
//弹窗js
$(function(){
    function popcenter(popup){
    var width = popup.outerWidth(),
        height = popup.outerHeight();
        popup.css({
        "margin-left" : -width/2,
        "margin-top" : -height/2
        }).show();
    }
    $(".p_tc_btn").click(function(){
        $(".p_tc_maxbg").show();
        popcenter($(".p_tc_box"));
    });
    $(".p_tc_close").click(function(){
        $(".p_tc_maxbg").hide();
        $(".p_tc_box").hide();
    })
})

// my account nav 我的帐户nav
$(function(){
	$(".p_zh_navul>li>h4>span").click(function(){
		// $(this).hide().siblings("span").show();
		var $nextUl=$(this).parent().next("ul");
		if($nextUl.is(":hidden")){
			$(this).parent().parent().siblings().children('ul').slideUp();
			$(this).parent().parent().find(".ico-home-23").show();
			$(this).parent().parent().find(".ico-home-14").hide();
			$(this).parent().parent().siblings().find(".ico-home-14").show();
			$(this).parent().parent().siblings().find(".ico-home-23").hide();
			$nextUl.slideDown();
		}else{
			$nextUl.slideUp();
			$(this).parent().parent().find(".ico-home-23").hide();
			$(this).parent().parent().find(".ico-home-14").show();
		}
	});
	$(".p_zh_navul>li h4 a").click(function(){
		var $nextUl=$(this).parent().next("ul");
		if($nextUl.is(":hidden")){
			$(this).siblings(".ico-home-14").trigger("click");
		}else{
			$nextUl.slideUp();
			$(this).parent().parent().find(".ico-home-23").hide();
			$(this).parent().parent().find(".ico-home-14").show();
		}
	})
});
//充值 银行选择
  $(function(){
    $(".bank_type li").click(function(){
      $(this).find(".bank_bg").css("display","block").parent().siblings().find(".bank_bg").css("display","none");
    })
  })

//关闭充值遇到问题
$(function(){
	$(".item_input_btn").click(function(){
		$(".footer_page_opacity,.chonzhi_question").css("display","block");
	});
	$(".login-close").click(function(){
        $(".footer_page_opacity,.chonzhi_question").css("display","none");
	});
	$(".back_type").click(function(){
		$(".footer_page_opacity,.chonzhi_question").css("display","none");
	})
})

// 充值记录开始结束时间
document.getElementById("start-btn").onclick =function(){
        laydate({
          elem:'#start'
      })
  }
document.getElementById("finish-btn").onclick =function(){
        laydate({
          elem:'#finish'
      })
  }
















