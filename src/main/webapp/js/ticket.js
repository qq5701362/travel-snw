$(function(){
	
	//时间控件
//	$('#ticket_dateTime').calendar({    
//    	current:new Date()    
//	}); 
	$("#ticket_showWindown").click(showWindown);
	$("#ticket_cannel").click(ticketCannel);
	
	
	$("#ticket_commit").click(ticketCommit);
	
	
	
	//关闭注册弹框单击事件
//	$("#mainPage_cancelRegist").click(cancelRegist);
//	
//	
//	//打开登录弹框单击事件
//	$("#mainPage_loginWindown").click(showLogin);
//	//关闭登录弹框单击事件
//	$("#mainPage_cancelLogin").click(cancelLogin);
//	
//	//注册按钮
//	$("#mainPage_regist").click(regist);
//	
//	//登录按钮
//	$("#mainPage_login").click(login);
	
})


function showWindown(){

	$("#ticket_modal").show();
}

/**
 * 提交
 */
function ticketCommit(){
	debugger;
	var ticketName = $("#ticket_name").val();
	if (!ticketName || ticketName.length < 3) {
		alert("请输入名字后再试！");
		return;
	}
	alert("提交成功");
	//关闭购票窗口
	ticketCannel();
}


/**
 * 
 */
function ticketCannel(){
	$("#ticket_modal").hide();

}


