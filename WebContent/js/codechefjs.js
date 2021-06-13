/**
 * 
 */

$(document).ready(function(){
	var wholedetail = $('#userCompleteInfo').hide();
	$('#spinner').hide();
	$('#submitButton').click(function(e){
		e.preventDefault();
		$('#spinner').show();
		$.ajax({
			type:'post',
			url:'CodeChef',
			data:$('form').serialize(),
			success:function(data){
				if(data.trim()==='Wrong User Id'){
					swal("Error", "This User Handle doesnot exist in CodeChef Database.", "warning");
					$('#spinner').hide();
					$('#userCompleteInfo').hide();
				}else{
					var data = jQuery.parseJSON(data);
					console.log("inside success");
					fillDetails(data);	
				}
				
			},error:function(data){
				
			}
		});
			
	});
	

});

	function fillDetails(data){
		$('#spinner').hide();
		document.getElementById('user_label').innerHTML = data.username;
		document.getElementById('institute_label').innerHTML = data.institution;
		document.getElementById('country_label').innerHTML = data.country;
		document.getElementById('state_label').innerHTML = data.state;
		document.getElementById('codechefrating_label').innerHTML = data.presentCodeChefRating;
		document.getElementById('highestRating_label').innerHTML = data.highestCodeChefRating;
		document.getElementById('longChallengeRating_label').innerHTML = data.longChallengeRating;
		document.getElementById('cookOffRating_label').innerHTML = data.cookOffRating;
		document.getElementById('lunchTimeRating_label').innerHTML = data.lunchTimeRating;
		document.getElementById('fullySolved_label').innerHTML = data.fullySolvedQuestions;
		document.getElementById('partiallySolved_label').innerHTML = data.partiallySolvedQuestions;
		document.getElementById('numberContests_label').innerHTML = data.numberOfContestParticipated;
		
		/*console.log(data.institution);
		console.log(data.username);*/
		
		
		$('#userCompleteInfo').show();
	}