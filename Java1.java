	function toPostProcess() {/*设置当获XHR对象获取到返回信息后执行以下代码*/ 
		if (xhr.readyState === 4) { 
			if (xhr.status === 200) {
				res = xhr.responseText;
				var obj = eval ("(" + res + ")");
				console.log("res ok:" +res); 
				try {   
					var textReply = obj.result.content; 
					str = '<div class="atalk"><span>' + textReply +'</span></div>';   
					// 将之前的内容与要发的内容拼接好 提交
					Words.innerHTML = Words.innerHTML + str; 
					// 置空
					TalkWords.value = "";
					// 滑动到最底部
					Words.scrollTop = Words.scrollHeight;
				} catch (e) {
					return handleError(xhr, e);
				}  
			} else {
				console.log("可能存在跨域问题，解决即可"); 
			}  
		} 
	}	
