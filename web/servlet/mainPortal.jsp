<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>

<%
    String projectPath=request.getContextPath();
%>

<html>
<head>
<title>playPen</title>

</head>

<body>
<jsp:include   page="head.jsp" flush="true"/>


<input type="button" value="clickMe" onclick="javascript:test();"/>
	
</body>

<script type="text/javascript">
	function test(){
		var action='<%=projectPath%>/HandleManager?handler=playPenHandler&methodName=getList&date='+new Date().getTime();
        $.ajax({
            url: action,
            method: 'get',
            dataType:"json",
            success: function(jsonStr,status){
                if(jsonStr){
                    
                }
            }
        });
	}					

</script>

</html>