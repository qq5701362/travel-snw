$(function(){
	
	jinQu();
	
	//获取cookie
	getCachceCookie ();
	
	//退出按钮，删除cookie信息
	$("#mainPage_signOut").click(signOut);

	//打开注册弹框单击事件
	$("#mainPage_registWindown").click(registWindown);
	//关闭注册弹框单击事件
	$("#mainPage_cancelRegist").click(cancelRegist);
	
	
	//打开登录弹框单击事件
	$("#mainPage_loginWindown").click(showLogin);
	//关闭登录弹框单击事件
	$("#mainPage_cancelLogin").click(cancelLogin);
	
	//注册按钮
	$("#mainPage_regist").click(regist);
	
	//登录按钮
	$("#mainPage_login").click(login);
	
})


/**
 * 如果存在cookie，则说明用户登陆过了
 */
function getCachceCookie(){
	var cookie = getCookie1("userId");
		
	//cookie不为空，则说明页面登陆过
	if (cookie) {
		//显示退出按钮
		$("#mainPage_registWindown").attr("style","display:none;");
		$("#mainPage_loginWindown").attr("style","display:none;");
		$("#mainPage_signOut").attr("style","display:block;");
	} else {
		//没有cookie信息，说明没有登陆，显示注册和登陆按钮
		$("#mainPage_signOut").attr("style","display:none;");
		$("#mainPage_registWindown").attr("style","display:block;");
		$("#mainPage_loginWindown").attr("style","display:block;");
	}
}

/**
 * 退出按钮，删除cookie
 */
function signOut(){
	var flag = delCookie("userId");
	if (flag){
		//删除cookie成功，显示登陆和注册按钮
		$("#mainPage_signOut").attr("style","display:none;");
		$("#mainPage_registWindown").attr("style","display:block;");
		$("#mainPage_loginWindown").attr("style","display:block;");
		return;
	} else {
		alert('退出失败');
		return;
	}
	
	
}

/**
 * 注册单击事件
 * (实质上是请求后台插入一条数据)
 */
function regist(){
	
	//清除提示信息内容
	$("#warning_1").html("");
	$("#warning_2").html("");
	$("#warning_3").html("");
	
	//获取输入框的值
	var name=$("#mainPage_name").val().trim();
	var nick=$("#mainPage_nickname").val().trim();
	var password=$("#mainPage_password").val().trim();
	var final_password=$("#mainPage_conpassword").val().trim();
	
	debugger;
	//校验格式
	var ok=true;
	//检测用户名
	if(name==""){
		ok=false;
		$("#warning_1").html("用户名为空");
		//运行结束
		return;
	}
	//检测密码
	if(password==""){
		ok=false;
		$("#warning_2").html("密码为空");
		//运行结束
		return;
	}else if(password.length < 6){
		ok=false;
		$("#warning_2").html("密码长度小于6位");
		//运行结束
		return;
	}
	//检测确认密码
	if(final_password!=password){
		ok=false;
		$("#warning_3").html("输入密码不一致");
		//运行结束
		return;
	}
	if(ok){
		$.ajax({
			url:path+"/user/regist.do",
			type:"post",
			data:{
				"account":name,
				"user_name":nick,
				"pswd":password
			},
			dataType:"json",
			
			success:function(result){
				if(result.state==0){
					//获取到用户的所有信息
					var user=result.data;
					alert("注册成功！");
					//关闭注册弹窗
					cancelRegist();
					//打开登陆弹框
					showLogin();
					//账号填充
					$("#mainPage_loginName").val(user.account);
					//密码输入域获得焦点
//					$("#mainPage_loginPwd").focus();
					
				}else if(result.state==2){
					$("#warning_1").html(result.message);
				}
			},
			error:function(data){
				debugger;
				alert("注册失败");
			}
		});
	}
}


/**
 * 登录单击事件
 */
function login(){
	debugger;
	//alert("绑定成功!");
	//清空提示信息
	$("#name_span").html("");
	$("#password_span").html("");
	//获取参数
	var name =$("#mainPage_loginName").val().trim();
	var password=$("#mainPage_loginPwd").val().trim();
	//参数数据格式校验
	var ok=true;
	if(name==""){
		$("#name_span").html("用户名为空");
		ok=false;
	}
	if(password==""){
		$("#password_span").html("密码为空");
		ok=false;
	}
	if(ok){ //通过格式校验
		debugger;
		//发送ajax请求
		$.ajax({
			url:path+"/user/login.do",
			type:"post",
			dataType:"json",
			data:{"account":name,"pswd":password},
			success:function(result){
				if(result.state==0){
					//成功
					var user=result.data;
					debugger;
					addCookie("userId",user.id,2);
					//关闭弹窗
					cancelLogin();
					//隐藏注册和登录按钮，显示退出按钮
					$("#mainPage_registWindown").attr("style","display:none;");
					$("#mainPage_loginWindown").attr("style","display:none;");
					
					//通过用户id判断是否是超级管理员
					if (user.id === 10000) {
						//跳转去管理页面
						window.location.href="log_in.html";
					} else {
						//普通用户
						$("#mainPage_signOut").attr("style","display:block;");
					}
					
					
				}else if(result.state==2){//用户名错误
					$("#count_span").html(result.message);
				}else if(result.state==3){//密码错误
					$("#password_span").html(result.message);
				}
			},
			error:function(){
				alert("登录失败");
			}
		});
	}
}



		
/**
 * 打开注册窗口
 */	
function registWindown(){
	$("#mainPage_registModal").show();
	//清空输入框
	$("#mainPage_name").val('');
	$("#mainPage_nickname").val('');
	$("#mainPage_password").val('');
	$("#mainPage_conpassword").val('');
}

/**
 * 关闭注册窗口
 */	
function cancelRegist(){
	$("#mainPage_registModal").hide();
}

/**
 * 打开登录窗口
 */	
function showLogin(){
	$("#mainPage_loginModal").show();
	//密码输入框一定是清空的
	$("#mainPage_loginPwd").val('');
}

/**
 * 关闭登录窗口
 */	
function cancelLogin(){
	$("#mainPage_loginModal").hide();
}


function jinQu () {
	$(".san_btn").click(function(e) {
        $(".san_intr").toggle()});
}
