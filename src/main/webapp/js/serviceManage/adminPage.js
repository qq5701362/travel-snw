$(function(){
        
    /**
     * 左侧菜单那点击事件
     *         （给a标签绑定事件）
     */
    $("a[pageUrl]").click(menuClick);
    
    /**
     * 切换风格事件
     */
    $("#adminPage_Themesmeus").menu({
        onClick:function(item){
            themesmeus(item);
        }
    });
    
})
function menuClick(){

    debugger;
    //1.获取pageUrl属性值（需要跳转的页面地址）
    var pageUrl = $(this).attr("pageUrl");
    //获取a标签的内容，标题
    var title = $(this).text();

    //2.判断是否存在指定标题的选项卡
    if( $("#adminPage_tableEdit").tabs("exists",title)  )  {
        //3.如果存在，则选项该选项卡
        $("#adminPage_tableEdit").tabs("select",title);                
    }else{
        //4.如果不存在，则添加选项卡
        $("#adminPage_tableEdit").tabs("add",{
            title:title,
            content:"<iframe src='"+pageUrl+"' width='100%' height='100%' frameborder='0'><iframe>",
            closable:true
        });                
    }
    
}
function themesmeus(item){

    debugger;
    //1.获取需要改变的模块名称
    var themeName = item.text;
    
    //2.获取link标签的href属性
    var href= $("#adminPage_themeLink").attr("href");
    
    //3.更改href的属性值
    // easyui/themes/default/easyui.css
    href = href.substring(0,href.indexOf("themes"))+"themes/"+themeName+"/easyui.css";
    
    //4.更新link的href属性
    $("#adminPage_themeLink").attr("href",href);

}