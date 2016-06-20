var margin="20px";
            var s_rollno=2562448; var e_rollno=2563000;

            var script = document.createElement('script');
            script.setAttribute('type', 'text/javascript');
            script.setAttribute('src', 'https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js');
            document.head.appendChild(script);

            var children=$("<table></table>"); children.css("border","1px");
            $("body").html(children);
        for(var r_no=s_rollno;r_no<e_rollno;r_no++)
        {        
            console.log("trying roll no=" + r_no);
            var req1=new XMLHttpRequest({mozSystem: true});

            req1.open("POST","http://www.rajresults.nic.in/sci2016bser.asp",false);    

            req1.setRequestHeader("referer","http://www.rajresults.nic.in/sci2016bser.htm");
            req1.setRequestHeader("Origin","http://www.rajresults.nic.in");

            var fd=[];
            fd.push("roll_no="+r_no);
            var urlEncodedDataPairs = [];
            urlEncodedData = fd.join('&').replace(/%20/g, '+');
            req1.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
            req1.setRequestHeader('Content-Length', urlEncodedData.length);            

            req1.send(urlEncodedData);

            if(req1.status==200)
            {
                var name= req1.responseText.match(/<strong>[\S|\ ]*<\/strong>/g)[2];
                if(name =="undefined"){console.log("Invalid roll no"); continue; } 

                name=name.replace("<strong>","").replace("</strong>","").replace(" ","");

                var f_name= req1.responseText.match(/<strong>[\S|\ ]*<\/strong>/g)[4];
                f_name=f_name.replace("<strong>","").replace("</strong>","").replace(" ","");
                var school= req1.responseText.match(/<strong>[\S|\ ]*<\/strong>/g)[8];
                school=school.replace("<strong>","").replace("</strong>","").replace(" ","");
                var percent= req1.responseText.match(/<strong>[\S|\ ]*<\/strong>/g)[15];
                if(percent != undefined)
                {
                    percent=percent.substring(percent.indexOf("Percentage:  ")+"Percentage:  ".length,percent.indexOf("%</font>"));
                }
                else
                {
                    percent="0";
                }


                var node_name=$("<td></td>"); node_name.html(name); node_name.css("border","1px solid black");
                var node_fname=$("<td></td>"); node_fname.html(f_name);  node_fname.css("border","1px solid black");
                var node_school=$("<td></td>"); node_school.html(school); node_school.css("border","1px solid black");
                var node_percent=$("<td></td>"); node_percent.html(percent); node_percent.css("border","1px solid black");

                var newstudent=$("<tr></tr>");
                newstudent.append(node_name).append(node_fname).append(node_school).append(node_percent);

                children.append(newstudent);
                window.scrollTo(0,document.body.scrollHeight);
            }            
        }
