/**
 *  For Validation
 */

function isAlphaNumeric(str) {
  var code, i, len;

  for (i = 0, len = str.length; i < len; i++) {
    code = str.charCodeAt(i);
    if (!(code > 47 && code < 58) && // numeric (0-9)
        !(code > 64 && code < 91) && // upper alpha (A-Z)
        !(code > 96 && code < 123)) { // lower alpha (a-z)
      return false;
    }
  }
  return true;
};

function isValidDate(str){
    var q = new Date();


    var parts = str.split("/");
var dt = new Date(parseInt(parts[2], 10),
                  parseInt(parts[1], 10) - 1,
                  parseInt(parts[0], 10));
    
mydate=new Date(dt);

if(q>dt)
{
    return false;
}
else
{
    return true;
}

}

function validate(){
    
    var teamA1= document.getElementsByName("teamA")[0].value;
	var teamB1= document.getElementsByName("teamB")[0].value;
	var teamA= teamA1.replace(/\s/g,'');
    var teamB= teamB1.replace(/\s/g,'');
    var date= document.getElementsByName("date")[0].value;
    var time= document.getElementsByName("time")[0].value;
    var scoreA= document.getElementsByName("scoreA")[0].value;
    var scoreB= document.getElementsByName("scoreB")[0].value;
    var result='';
    
    var pattern = new RegExp("[^a-zA-Z0-9]");
    var timeeformat=new RegExp(/^(?:2[0-3]|[01]?[0-9]):[0-5][0-9]:[0-5][0-9]$/);
    var dateformat=new RegExp(/^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/);
    var scorepat = new RegExp(/^[0-9]{2,3}\/[0-9]{1,2}$/);
    
    if(teamA1 =='' || teamA1==null || teamA1.length >=50 || pattern.test(teamA)){
        result = result + "Invalid TeamA Name";
    }
    
    if(teamB1 =='' || teamB1==null || teamB1.length >=50 || pattern.test(teamB)){
        result = result + "<br>Invalid TeamB Name";
    }
   
    if(date =='' || !dateformat.test(date) || isValidDate(date)){
        result = result + "<br>Invalid Date";
    }
    
    if(time =='' || !timeeformat.test(time)){
        result = result + "<br>Invalid Time";
    }
    
    
    
    if(scoreA =='' || !scorepat.test(scoreA)){
        result = result + "<br>Invalid TeamA Score";
    }
    
    if(scoreB =='' || !scorepat.test(scoreB)){
        result = result + "<br>Invalid TeamB Score";
    }
	
    if(result == ''){
        document.getElementById('error').innerHTML = '';
         var wtas=scoreA.split("/",1);
        var wtbs=scoreB.split("/",1);
   
   if(wtas>wtbs)
   {
       document.getElementById("win").innerHTML=teamA1;
   }
   if(wtas<wtbs)
   {
       document.getElementById("win").innerHTML=teamB1;
   }      
    }else{
        document.getElementById('win').innerHTML = '';
	   document.getElementById('error').innerHTML = result;
    }
    
    
}