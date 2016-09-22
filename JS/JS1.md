Know your JavaScript Part – 1
-	Prashant I
Name  :
ID :
Marks :        / 76     Time : 60 min
1.	What’s the result?
           
var result =  typeof typeof null;
console.log(result);

a)	‘undefined’
b)	‘string’
c)	‘null’
d)	‘object’
e)	Error
f)	Write your own answer

2.	What’s the result?
    
var result = 789[‘toString’][‘length’];
console.log(result);

a)	789
b)	3
c)	1
d)	0
e)	Error
f)	Write your own answer 
3.	What’s the result?

var result = (7,6 - 5) * 2;
  console.log(result);

a)	1
b)	2
c)	3
d)	4
e)	Error
f)	Write your own answer

4.	What’s the result?

var abc = 10;
var bob = {
abc: 20,
  get: function () {
    var abc = 30;
    return this.abc;
  }}; 
console.log(
  bob.get(),
  (bob.get = bob.get)(),
  (bob.get)(),
  (bob.get, bob.get)());

a)	20,20,20,20
b)	20,20,10,10
c)	20,20,20,10
d)	20,10,20,10
e)	10,10,10,10
f)	10,10,20,20
g)	10,10,10,20
h)	10,20,10,20
i)	30,30,30,30
j)	Write you own answer

5.	What’s the result?

function bob(a,b) {
	a = 5;
console.log(
            arguments[0], arguments[1]);
};
bob();

a)	5,undefined
b)	undefined,undefined
c)	5,null
d)	Error
e)	Write your own answer

6.	What’s the result?

function bob(a,b) {
	a = 5;
console.log(
arguments[0], arguments[1]);
};
bob(9,9,9);

a)	5,undefined
b)	undefined,undefined
c)	5,null
d)	5,9
e)	9,9
f)	Error
g)	Write your own answer

7.	What’s the result?

function bob(a,b) {
	arguments[0] = 5;
console.log(
a, arguments[1]);
};
bob(9,9,9);

a)	5,undefined
b)	undefined,undefined
c)	5,null
d)	5,9
e)	9,9
f)	Error
g)	Write your own answer

8.	What’s the result?

var i = 40;
var j = (2,
    function (k) { return k + 10},
    function () { return arguments[0]}
);
 
var result = i + j({ele : 10}).ele;

a)	42
b)	NaN
c)	undefined
d)	‘[object Object]10’
e)	50
f)	Write your own answer

9.	What’s the result?

(function (){
	return typeof arguments;
})();

a)	‘array’
b)	‘undefined’
c)	‘arguments’
d)	‘object’
e)	Write your own answer
10.	What’s the result?

var a = [typeof a, typeof b][1];
var result = typeof typeof a;

a)	‘array’
b)	‘undefined’
c)	‘operator’
d)	‘object’
e)	Write your own answer


11.	What’s the result?

var bob = function dog () {return 3;};
dog();

a)	Error
b)	undefined
c)	3
d)	Write your own answer

12.	What’s the result?

var bob = function dog () {return 3;};
var result = typeof dog();

a)	‘function’
b)	‘number’
c)	‘undefined’
d)	Error
e)	Write your own answer
13.	What’s the result?

(function (val) {
    delete val;
    return val;
  })({a:1,b:2});

a)	Error
b)	null
c)	undefined
d)	{a:1,b:2}
e)	Write your own answer

14.	What’s the result?

(function (val) {
    delete val;
    return val;
  })(123);

a)	Error
b)	null
c)	undefined
d)	123
e)	Write your own answer

15.	What’s the result?

var x = new Array(5);
y = new Array(2);
console.log(delete x,
delete y);

a)	Error
b)	true true
c)	true false
d)	false true
e)	false false
f)	Write your own answer

16.	What’s the result?

var x = 2;
y = 3;
delete x;
delete y;
console.log(x);
console.log(y)

a)	Error
b)	2 3
c)	2 Error
d)	Error
e)	Error Error
f)	undefined undefined
g)	null null
h)	Write your own answer

17.	What’s the result?

var a = ['A','B','Ç','D','E','F','G'];
a['A'] = 'a';
a['B'] = 'b';
a['C'] = 'c';
console.log(a.length);
console.log(delete a);

a)	Error
b)	10 false
c)	7 true
d)	10 true
e)	7 false
f)	Write your own answer

18.	What’s the result?

var a = ['A','B','Ç','D','E','F','G'];
a['A'] = 'a';
a['B'] = 'b';
a['C'] = 'c';
console.log(a.length);
console.log(delete a[1]);
console.log(a.length);
console.log(a[1]);
console.log(delete a[‘B’]);
console.log(a.length);
console.log(a[‘B’]);

a)	Error
b)	10 true 9 ‘C’ true 8 undefined 
c)	7 true 6 ‘C’ true 6 undefined 
d)	7 true 7 undefined true 7 undefined 
e)	7 false 7 ‘B’ true 7 undefined
f)	7 false 7 ‘B’ false 7 ‘b’

19.	What’s the result?

var a = {b:1,c:2,d:3};
console.log(a.length);
console.log(delete a.c);
console.log(a.length);
console.log(JSON.stringify(a));

a)	Error
b)	undefined true undefined {“b”:1,”d”:2}
c)	3 true 2 {“b”:1,”d”:2}
d)	1 true 1 {“b”:1,”d”:2}
e)	3 false 3 {“b”:1,”c”:2,”d”:2}
f)	undefined false undefined {“b”:1,”c”:2,”d”:2}
g)	Write your own answer


20.	What’s the result?

var a = new String('34');
console.log(a.length);
console.log(delete a.length);
console.log(a.length);
console.log(delete Math.PI);
console.log(delete Infinity);

a)	Error
b)	2 true undefined true true
c)	2 false 2 true true
d)	2 true undefined false false
e)	2 false 2 false false
f)	Write your own answer

21.	What’s the result?

var a = 1, b = a = typeof b;
console.log(b);

a)	‘number’
b)	1
c)	‘undefined’
d)	undefined
e)	Write your own answer

22.	What’s the result?

(function fun(fun){
    return typeof fun();
  })(function(){ return 1; });

a)	‘number’
b)	1
c)	‘undefined’
d)	undefined
e)	Write your own answer

23.	What’s the result?

var num = 100; 
var result = 'AP_' + (num == ‘100’) ? 'Hehe':'Haha';

a)	undefined
b)	‘Hehe’
c)	‘Haha’
d)	AP_(num == ‘100’) ? ‘Hehe’:’Haha’
e)	‘AP_Hehe’
f)	Write your own answer





24.	What’s the result?

(function(xx) {
    return typeof xx.yy;
  })({ xx: { yy: null } });

a)	Error
b)	null
c)	undefined
d)	‘undefined’
e)	‘óbject’
f)	‘null’
g)	Write your own answer

25.	What’s the result?

(function xx() {
    function xx(){ return -1; }
    return xx();
    function xx(){ return 1; }
  })();

a)	Error
b)	-1
c)	1
d)	undefined
e)	‘null’
f)	Write your own answer

26.	What’s the result?

function xx(){ return 1; }
function yy(){ return xx; }
var result1 = new xx() instanceof xx;
var result2 = new yy() instanceof yy;
console.log(result1, result2,
result1 + result2);

a)	Error
b)	true true truetrue
c)	false false falsefalse
d)	true true 2
e)	false false 0
f)	true false 1
g)	false true 1
h)	Write your own answer

27.	What’s the result?

var x = 1;
if (function xx(){}) {x += typeof xx;}
console.log(x);

a)	Error
b)	‘1undefined’
c)	‘1function’
d)	undefined
e)	NaN
f)	Write your own answer

28.	What’s the result?

with (function (a, b){}) {
     console.log(length);
};

a)	Error
b)	1
c)	2
d)	undefined
e)	Write your own answer

29.	What’s the result?

with (function (b, null){}) {
     console.log(length);
};

a)	Error
b)	1
c)	2
d)	undefined
e)	Write your own answer

30.	What’s the result?

with (function (a, undefined){}) {
     console.log(length);
};

a)	Error
b)	1
c)	2
d)	undefined
e)	Write your own answer

31.	What’s the result?

var xx = (function xx(){ return "4"; }, function yy(){ return 5; })();
console.log(typeof xx);

a)	Error
b)	‘undefined’
c)	‘string’
d)	‘number’
e)	‘4’
f)	5
g)	‘function’
h)	Write your own answer








32.	What’s the result?

var xx = {
    y: function(){ return this.yy; },
    yy: 1
  }
console.log(typeof (x = xx.y)());

a)	Error
b)	‘undefined’
c)	‘string’
d)	‘number’
e)	‘object’
f)	1
g)	‘function’
h)	Write your own answer

33.	What’s the result?

var xx = {
    y: function() { return this.yy; },
    yy: 1
  };
  (function(){
    return typeof arguments[0]();
  })(xx.y);

a)	Error
b)	‘undefined’
c)	‘string’
d)	‘number’
e)	‘object’
f)	1
g)	‘function’
h)	Write your own answer

34.	What’s the result?;

var yy = null;
var xx = {
    y: function() { return this.yy; },
    yy: 1
  };
  (function(){
    return typeof arguments[0]();
  })(xx.y);

a)	Error
b)	‘undefined’
c)	‘string’
d)	‘number’
e)	‘object’
f)	1
g)	‘function’
h)	Write your own answer


35.	What’s the result?

var xx = function yy () {return 23;};
var result = typeof yy;

a)	‘function’
b)	‘number’
c)	‘undefined’
d)	Error
e)	Write your own answer

36.	What’s the result?

var yy = 'hehehe';
var xx = {
    y: function() { return this.yy; },
    yy: 1
  };
  (function(){
	  arguments.yy = 23;
    return typeof arguments[0]();
  })(xx.y);

a)	Error
b)	‘undefined’
c)	‘string’
d)	‘number’
e)	‘object’
f)	1
g)	‘function’
h)	Write your own answer

37.	What’s the result?

console.log(1 && 7);

a)	Error
b)	true
c)	false
d)	1
e)	7
f)	Write your own answer

38.	What’s the result?

console.log(1 && 0);

a)	Error
b)	true
c)	false
d)	1
e)	0
f)	Write your own answer





39.	What’s the result?

console.log('false' && 7);

a)	Error
b)	true
c)	false
d)	'false'
e)	7
f)	Write your own answer

40.	What’s the result?

console.log(1 && 'hi' || 0);
a)	Error
b)	true
c)	false
d)	1
e)	'hi'
f)	0
g)	Write your own answer’
41.	What’s the result?

console.log(1 && 'hi' && 0);

a)	Error
b)	true
c)	false
d)	1
e)	'hi'
f)	0
g)	Write your own answer

42.	What’s the result?

console.log(1 || 'hi' && 0);

a)	Error
b)	true
c)	false
d)	1
e)	'hi'
f)	0
g)	Write your own answer

43.	What’s the result?

console.log(1 || 'hi' || 0);

a)	Error
b)	true
c)	false
d)	1
e)	'hi'
f)	0
g)	Write your own answer’


44.	What’s the result?

console.log((3,7,1));

a)	Error
b)	true
c)	false
d)	3
e)	7
f)	1
g)	Write your own answer

45.	What’s the result?

console.log({xx:44}[0]);

a)	Error
b)	undefined
c)	null
d)	xx
e)	44
f)	Write your own answer

46.	What’s the result?

var res = [false, true][+true, +false];
console.log(res);

a)	Error
b)	false
c)	true
d)	undefined
e)	Write your own answer

47.	What’s the result?

console.log(--'100'.split('')[0]);

a)	Error
b)	9
c)	99
d)	-1
e)	0
f)	1
g)	Write your own answer

48.	What’s the result?

console.log(--'-99'.split('')[0]);

a)	Error
b)	9
c)	99
d)	-8
e)	-10
f)	NaN
g)	undefined
49.	What’s the result?

console.log(1 + 2 + '6');
console.log(1 + '2' + 6);
console.log('1' + 2 + 6);

a)	Error
b)	126 126 126
c)	9 9 9
d)	36 126 18
e)	36 126 126
f)	NaN NaN NaN
g)	Write your own answer

50.	What’s the result?

console.log(1 - 2 - '6');
console.log(1 - '2' - 6);
console.log('1' - 2 - 6);

a)	Error
b)	-7 -7 -7
c)	1-2-6 1-2-6 1-2-6
d)	-1-6 1-2-6 1-2-6
e)	-1-6 1-2-6 1-8
f)	NaN NaN NaN
g)	Write your own answer

51.	What does below statement evaluate to ?

{xx:{yy:7}};
>> 

52.	What does below statement evaluate to ?

(function(){}())
>> 
53.	What’s the result?

var res1 = (function () {return 5;}());
var res2 = (function () {return 3;})();
var res3 = (function (a) {delete a})();
console.log(res1);
console.log(res2);
console.log(res3);

a)	Error
b)	undefined 3 undefined
c)	undefined undefined undefined
d)	5 3 undefined
e)	Write your own answer

54.	What’s the result?

var res1 = 'hehe'.toString.length;
var res2 = '777'.toString.length;
var res3 = ''.toString.length;
var res4 = (777).toString.length;
var res5 = 777..toString.length;
console.log(res1);
console.log(res2);
console.log(res3);
console.log(res4);
console.log(res5);

a)	Error 
b)	0 0 0 0 0
c)	0 0 0 1 1
d)	4 3 0 3 3 
e)	4 3 0 Error Error
f)	Write your own answer’

55.	What’s the result?

var res1 = 'a' + {};
var res2 = function () {} + 'a';
var res3 = 'a' + [];
console.log(res1);
console.log(res2);
console.log(res3);

a)	Error 
b)	'a[object Object]' 'function () {}a' 'a[object Object]'
c)	'a{}' 'function () {}a' 'a[]'
d)	undefined undefined undefined
e)	'a[object Object]' 'function () {}a' 'a'
f)	Write your own answer

56.	What’s the result?

console.log({} + 'Z' < {} + 'z');

a)	Error 
b)	true 
c)	false
d)	0
e)	1
f)	undefined
g)	Write your own answer













57.	What’s the result?

console.log(['a', 'b', 'c'].join());
console.log(['a', 'b', 'c'].join(''));
console.log(['a', 'b', 'c'] + ['a', 'b']);

a)	Error 
b)	a,b,c a,b,c a,b,ca,b 
c)	abc a,b,c a,b,ca,b
d)	a,b,c abc a,b,ca,b
e)	a,b,c abc abcab
f)	a,b,c abc ['a', 'b', 'c', 'a', 'b']
g)	Write your own answer

58.	What does below statement evaluate to ?

{1;break;33;};
>> 

59.	What does below statement evaluate to ?

{ hi = 999 };
>> 
60.	What does below statement evaluate to ?

new Array(4).join();
>> 

61.	What’s the result?

var yy = 5; 
(function () {
return yy; 
var yy = null;}());

a)	Error
b)	null
c)	5
d)	undefined
e)	Write your own answer

62.	What’s the result?

 (function () {
	var yy = 
5
return 
yy
var yy = null}());

a)	Error
b)	null
c)	5
d)	undefined
e)	Write your own answer

63.	What’s the result?

 (function () {
	var yy = 
5
return yy
var yy = null}());

a)	Error
b)	null
c)	5
d)	undefined
e)	Write your own answer

64.	What’s the result?

function xx(yy) {
    return 6 * yy;
}
var xx;
console.log(typeof xx);

a)	Error
b)	‘undefined’
c)	‘function’
d)	‘string’
e)	Write your own answer

65.	What’s the result?

function xx(yy) {
    return 6 * yy;
}
var xx = 'hehe';
console.log(typeof xx);

a)	Error
b)	‘undefined’
c)	‘function’
d)	‘string’
e)	Write your own answer

66.	What’s the result?

var xx;
function xx(yy) {
    return 6 * yy;
}
console.log(typeof xx);

f)	Error
g)	‘undefined’
h)	‘function’
i)	‘string’
j)	Write your own answer
67.	What’s the result?

var xx = 'hehe';
function xx(yy) {
    return 6 * yy;
}
console.log(typeof xx);

a)	Error
b)	‘undefined’
c)	‘function’
d)	‘string’
e)	Write your own answer

68.	What’s the result?

var xx = 8;
var yy = 90;
console.log(xx + +yy);

a)	Error
b)	990
c)	891
d)	98
e)	Write your own answer

69.	What’s the result?

var xx = 9;
var yy = '40';
console.log(xx + +yy);

a)	Error
b)	'940'
c)	49
d)	'1040'
e)	NaN
f)	Write your own answer

70.	What’s the result?

var xx = 14;
var yy = '110';
console.log(xx+++yy); 
console.log(xx);
console.log(yy);

a)	Error
b)	125 14 '110'
c)	124 14 '110'
d)	'14110' 15 '110'
e)	NaN 14 '110'
f)	Write your own answer

71.	What’s the result?

var xx = 14;
var yy = 89;
console.log(xx+++yy); 
console.log(xx);
console.log(yy);

a)	Error
b)	103 15 89
c)	104 15 89
d)	104 14 90
e)	103 14 90
f)	NaN 14 89
g)	Write your own answer

72.	What’s the result?

var xx = [];
xx[0] = '40';
xx['1'] = '41';
xx['2'] = '42';
xx['a'] = '4a';
xx['b'] = '4b';
xx.push(undefined);
console.log(xx.length);

a)	Error
b)	3
c)	4
d)	5
e)	6
f)	undefined
g)	Write your own answer

73.	What’s the result?

var xx = 9;
yy = 40;
setTimeout(function () {
	console.log(this.yy);
  console.log(this.xx);
}, 5000);

a)	Error
b)	undefined undefined
c)	40 9
d)	9 40
e)	null null
f)	Write your own answer










74.	What’s the result?

var xx = 9;
yy = 40;
console.log(xx);
console.log(window.xx);
console.log(this.xx);
console.log(yy);
console.log(window.yy);
console.log(this.yy);

a)	Error
b)	9 9 9 40 40 40
c)	9 undefined 9 40 undefined 40
d)	9 undefined undefined 40 undefined undefined
e)	9 null null 40 null null
f)	Write your own answer

75.	What’s the result?

var xx = -1;
yy = 0;
this.zz = 1;
console.log(xx/yy);
console.log(yy/xx);
console.log(this.zz/yy);

a)	Error
b)	NaN 0 Nan
c)	undefined 0 undefined
d)	Infinity 0 -Infinity
e)	infinity 0 --infinity
f)	Write your own answer

76.	What’s the result?

var xx = 45;
var obj = {
        xx: 10,
        get: function get() {
            var xx = 20;
            setTimeout(function (){
                console.log(this.xx);
            }, 1000);
        }
};
obj.get();

a)	Error
b)	undefined
c)	45
d)	10
e)	20
f)	Write your own answer

