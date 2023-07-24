	function toChat2(enterpriseID,platform, query, source,userStatus,username){
		var url = "http://10.0.30.15:8092/SmartServer/robot/chat"; 
		xhr.onreadystatechange = toPostProcess;
		xhr.open("post", url, true);  
		xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");  
		xhr.send(JSON.stringify({
			"enterpriseID": enterpriseID,
			"platform": platform,
			"query": query,
			"source": source,
			"userStatus": userStatus,
			"username": username 
		})); 
		console.log("ok"); 
	} 
