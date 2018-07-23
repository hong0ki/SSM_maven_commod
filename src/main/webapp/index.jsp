<html>
<body>
<h2>Hello World!</h2>
<p onclick="aa()">ddddd</p>
<script type="text/javascript">

 function aa(){
	alert(88888);
	 $.ajax({
			type:"post",
			url:"/mavenssm/user/getAllUser",
			dataType:"json",
			data:{
				"type":33
			},
			anync:false,
			success:function(data){
				alert(data);
			}
		})
 }
</script>

</body>
</html>
