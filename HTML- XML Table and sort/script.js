function loadXMLDoc() {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      myFunction(this);
    }
  };
  xmlhttp.open("GET", "player.xml", true);
  xmlhttp.send();
}

function myFunction(xml) {
  var i;
  var xmlDoc = xml.responseXML;
  var table="<tr><th>Artist</th><th>Title</th></tr>";
  var x = xmlDoc.getElementsByTagName("player");
  for (i = 0; i <x.length; i++) {
    table += "<tr><td>" +
    x[i].getElementsByTagName("pid")[0].childNodes[0].nodeValue +
    "</td><td>" +
    x[i].getElementsByTagName("name")[0].childNodes[0].nodeValue +
    "</td><td>"+
      x[i].getElementsByTagName("role")[0].childNodes[0].nodeValue +
    "</td><td>"+
      x[i].getElementsByTagName("battingstyle")[0].childNodes[0].nodeValue +
    "</td><td>"+
      x[i].getElementsByTagName("bowlingstyle")[0].childNodes[0].nodeValue +
    "</td><td>"+
      x[i].getElementsByTagName("score")[0].childNodes[0].nodeValue +
    "</td></tr>";
  }
  document.getElementById("demo").innerHTML = table;
}