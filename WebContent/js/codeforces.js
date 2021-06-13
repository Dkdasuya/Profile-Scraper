


$(document).ready(function(){
	$('#userCompleteInfo').hide();
	$('#spinner').hide();
	$('#submitButton').click(function(e){
		e.preventDefault();
		$('#spinner').show();
		$.ajax({
			type:'post',
			url:'LeetCode',
			data:$('form').serialize(),
			success:function(data){
				if(data.trim()==='Wrong User Id'){
					swal("Error", "This User Handle doesnot exist in CodeForces Database.", "warning");
					$('#spinner').hide();
					$('#userCompleteInfo').hide();
				}else{
					var data = jQuery.parseJSON(data);
					console.log("inside success");
					console.log(data);
					fillDetails(data);	
				}
				
			},error:function(data){
				
			}
		});
			
	});
	

});

	function fillDetails(data){
		$('#spinner').hide();
		console.log(data.contestRating);
		document.getElementById('contestRating_label').innerHTML = data.contestRating;
		document.getElementById('rank_label').innerHTML = data.ranking;
		document.getElementById('user_label').innerHTML = data.username;
		
		document.getElementById('allTime_label').innerHTML = data.solvedForAllTime;
		document.getElementById('lastYear_label').innerHTML = data.solvedForLastYear;
		document.getElementById('lastMonth_label').innerHTML = data.solvedForLastMonth;
		document.getElementById('rowMax_label').innerHTML = data.inARowMax;
		document.getElementById('rowYear_label').innerHTML = data.inARowLastYear;
		document.getElementById('rowMonth_label').innerHTML = data.inARowLastMonth;
		document.getElementById('contribution_label').innerHTML = data.contributions;
		
		/*console.log(data.institution);
		console.log(data.username);*/
		
		
		$('#userCompleteInfo').show();
	}