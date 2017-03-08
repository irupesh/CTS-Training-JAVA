function getData(){
	
(function(window,undefined){
	window.T2CSV=function(table){
		if(! (table instanceof window.HTMLTableElement))
		{
			throw new window.TypeError('A <table> element is required, instead '+table+' was passed');
		}
		
		var tr,thead,csv,tfoot,cols,prop=(table.innerText===undefined?'textContent':'innerText'),
			setVars=function(){
				var elements=table.getElementsByTagName('tr');
			
				
				tr=Array.prototype.slice.call(elements,1);
				thead=elements[0];
				cols=thead.children.length;
				elements=null; //free memory
				csv='';
				
			},
			render={
				header:function(){
					if(! (thead.children[0] instanceof window.HTMLTableCellElement))
					{
						throw new window.RangeError('At least 1 <tr> element with 1 <td> or <th> is required.');
					}
					
					for(var i=0,children=thead.children,l=children.length,csv=[];i<l;i++)
					{
						csv[csv.length]=''+children[i][prop]+'';
					}
					children=null; //free memory
					return csv;
				},
				data:function(){
					
					if(!tr.length)
					{
						return '';
					}
					
					for(var i=0,l=tr.length,csv=[],tfoot=false;i<l;i++)
					{
						if(!tfoot && tr[i].parentNode.tagName=='TFOOT')
						{
							tfoot=tr[i];
							continue;
						}
						csv[csv.length]=render.row(tr[i]);
					}
					
					if(tfoot)
					{
						csv[csv.length]=render.row(tfoot);
					}
					
					return csv.join('\r\n');
				},
				row:function(tr){
					var td=tr.getElementsByTagName('td');
					
					if(!td.length)
					{
						td=tr.getElementsByTagName('th');
					}
					
					for(var i=0,tmp=[];i<cols;i++)
					{
						tmp[i]=td[i]?''+td[i][prop]+'':'"';
					}
					return tmp+'';
				}
			};
		
		setVars();
		
		return {
			toString:function(){
				if(csv)
				{
					return csv;
				}
				
				return csv = [render.header(),render.data()].join('\r\n');
			},
			valueOf:function(){return this.toString();},
			refresh:function(){
				setVars();
			}
		}
		
	}
	
})(function(){}.constructor('return this')());

var csv=T2CSV(document.getElementById('topScore'));

document.getElementById('csvData').value=csv.toString().replace(/\r\n/g,'\n');
}