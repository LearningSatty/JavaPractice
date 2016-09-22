1] What will be the result : 
          history.go(2);
Goes 2 pages forward

2]What will be the result of following statements :
    typeof alert(false)
    typeof confirm('please enter a value')
    typeof prompt('are you programmer?')


3] How do you remove a cookie.

Set time to past

4] What is the default expiry time for a cookie.

Browser open session if time is not set

5] What will be the output : 

var x ={y:[].shift};
console.log(x.y.call([1]));
console.log(x.length);


6] What will be the output : 

'This is string'.substr(1,3)
'This is string'.substring(1,3)
'This is string'.slice(1,3)
'This is string'.splice(1,3)


7] What Date.parse() method does?
Returns millisecond.

8] What will be the output :
var b = false;
console.log(typeof b.valueOf());


9] Diff b/w window.innerHeight and window.outerHeight
10] What will be the output of following function:
function f(){
  b = 10;
  delete b;
  var b;
  console.log(b);
}


11] What will be the output : 
function A(){
	this.a1 = 10; this.a2 = "A";
}
function B(){
	this.b1 = 20; this.b2 = "B";
}
function C(){
	B.call(this);
	this.c1 = 30; this.c2 = "C";
}
C.prototype = new A;
var co = new C();
console.log(co.b2);
console.log(co instanceof A);
console.log(co instanceof B);
console.log(co instanceof C);



12] What will be the output : 
function A(a1, a2){
	this.a1 = a1; this.a2 = a2;
}
A.prototype.sayHello = function(){alert('hello '+this.a2);}
function C(){
	this.c1 = 30; this.c2 = "C";
}
var ao = new A(10, "A");
C.prototype = new A;
var co = new C();
co.sayHello();


13] What will be the output:
function A(a1, a2){
  this.a1 = a1; this.a2 = a2;
}
function C(){
  this.c1 = 30; this.c2 = "C";
}
C.prototype = new A;
var co = new C();
console.log(co.constructor);



14] What will be the output :
function A(){
  this.a1 = 10;
}
var ao = new A();
A.prototype = {a2:"A"};
console.log(ao.a1);
console.log(ao.a2);


15] What will be the output :
var b = {};
b[0] = 1;
b[1] = 2;
console.log(b[length]);
console.log(b['join']("/"));



16) If a string cannot be converted to a number _______ will be returned :-
	a. Infinite
	b. Zero
	c. NaN
	d. null
	


17) -Infinity in Js gets added with +Infinity, then output of code will be :-
	a. +Infinity
	b. NaN
	c. -Infinity
	d. zero

18)  //////////
    var num1 = 5,
    num2 = 10,
    result = num1+++num2;
//////////
The values of result, num1 and num2 respectively will be :-
	a. 16,5 and 11
	b. 15,6 and 10
	c. 16,6 and 10
	d. 15,5 and 11

	
19) What will be the output of following :-
	//////////
	function test(){
		message = "yo";
	}
	test();
	alert(message);
	//////////
	a. Error
	b. yo
	c. undefined
	d. None of these
	

20) What is the output of following line of code 
	//////////
	var num1 = parseInt("10Eight34", 8);
	alert(num1);
	/////////
	a. 10
	b. 4
	c. 8
	d. NaN


21)What is the output of following code snippet 
	//////////
    var o = {
        x: 8,

        valueOf: function(){
            return this.x + 2;
        },
        toString: function(){
            return this.x.toString();
        }
    },
    result = o < "9";
    alert(o);
	//////////
	
a. false
	b. true
	c. NaN
	d. Error
	

22) //////////
   var num1 = "16";
   var num2 = "24";
   //////////
   Which of the following is wrong :-
   a. Output of (num1 < num2) is true.
   b. Output of (+num1 < num2) is true.
   c. Output of (num1 + num2) is "1624".
   d. Output of (+num1 + num2) is 40.
   

23)  //////////
    	var a = 2416;
	var b = "2416";
	var c = (a != b);
	var d = (a !== b);
	alert("c = " + c + " and d = " + d);
    //////////
    What is the output of above code snippet :-
	a. c = false and d = true.
	b. c = false and d = false.
	c. c = true and d = true.
	d. c = true and d = false.


24)  //////////
    var c = "Ball" < "apple";
    var d = "23" < "3";
	alert("c = " + c + " and d = " + d);
    //////////
    What is the output of above code snippet :-
	a. c = false and d = true.
	b. c = false and d = false.
	c. c = true and d = true.
	d. c = true and d = false.
   

25) //////////
    	var x = (1 && "yo" && "go" || 0);
	alert(x);
//////////
What is the output of above code snippet :-
   	 a. 1.
	b. "yo".
	c. "go".
	d. 0.



