<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${doc.input.user}!</h1>
  <p>Our latest product:
  <a href="${doc.input.latestProduct.url}">${doc.input.latestProduct.name}</a>!
  <table>
  	<tbody>
  		<#list doc.input.row as row>
  		 <tr>
  			<#list row.col as col>
    			<td>${col}</td>
			  </#list>
  		 </tr>	
		</#list>  	
  	</tbody>
  </table>
</body>
</html> 