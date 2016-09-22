Know your JavaScript Part – 2
-	Prashant I
Name  :
ID :
Marks :        / 41     Time : 60 min
1.	What’s the result? 
           
var fn1 = function () { return true; }; 
window.fn2 = function () { return true; };
console.log(fn3() && fn2() && fn1());
function fn3 () { return true; }

a)	false
b)	undefined
c)	null
d)	true
e)	Error
f)	Write your own answer
2.	What’s the result?
    
console.log(typeof fn1 == 'undefined');
console.log(typeof fn2 == 'undefined');
console.log(typeof fn3 == 'undefined');
var fn1 = function () { return true; }; 
window.fn2 = function () { return true; };
function fn3 () { return true; }

a)	false true true
b)	true true true
c)	true true false
d)	false false false
e)	true false true
f)	false false true
g)	false true false
h)	Error
i)	Write your own answer 
3.	What’s the result?

function fn () { 
  console.log(fn()); 
  return fn();  
  function fn () { return true; } 
} ;
 
console.log(fn());

a)	true true
b)	false false
c)	true false
d)	false true
e)	Error
f)	Write your own answer


4.	What’s the result?

var fn1 = function fn2 () { 
       console.log(fn1 == fn2); 
}; 
fn1();
console.log(typeof fn2 == "undefined"); 

a)	Error
b)	Error true
c)	Error false
d)	true true
e)	false true
f)	false false
g)	Write you own answer

5.	What’s the result?

var xx = { 
  yy: function (n) { 
    return z > 0 ? 
        xx.yy(z-1) + "o" : "hell"; 
  } 
}; 
console.log(xx.yy(3));

a)	helloo
b)	hellooo
c)	hello
d)	Error
e)	Write your own answer

6.	What’s the result?

var xx = { 
  yy: function (z) { 
    return z > 0 ? 
        xx.yy(z-1) + "o" : "hell"; 
  } 
};
var zz = {
  yy : xx.yy
}; 
xx = null;
console.log(zz.yy(3));

a)	helloo
b)	hellooo
c)	hello
d)	Error
e)	Write your own answer






7.	What’s the result?

var xx = { 
  yy: function yy (z) { 
    return z > 0 ? 
        yy(z-1) + "o" : "hell"; 
  } 
};
var zz = {
  yy : xx.yy
}; 
xx = null;
console.log(zz.yy(3));

a)	helloo
b)	hellooo
c)	hello
d)	Error
e)	Write your own answer

8.	What’s the result?

var xx = { 
  yy: function (z) { 
    return z > 0 ? 
 arguments.callee(z-1) + "o" : "hell"; 
  } 
};
var zz = {
  yy : xx.yy
}; 
xx = null;
console.log(zz.yy(3));

a)	helloo
b)	hellooo
c)	hello
d)	Error
e)	Write your own answer

9.	What’s the result?

var xx = { 
  yy : true, 
  zz : function () { 
    this.yy = !xx.yy; 
  } 
}; 
xx.zz(); 
console.log(!xx.yy);

a)	true
b)	false
c)	undefined
d)	null
e)	Error
f)	Write your own answer

10.	What’s the result?

var xx = function () { 
  this.yy = true;
};
var ww = {  
  zz : function () { 
    this.yy = true; 
  } 
};xx(); 
console.log(yy); 
console.log(!ww.yy);ww.zz();
console.log(!ww.yy);

a)	true true true
b)	true undefined undefined
c)	undefined undefined undefined
d)	true false false
e)	true undefined false
f)	true undefined true
g)	true true false
h)	Error
i)	Write your own answer


11.	What’s the result?

var bob = function () {return this;};
var dog = function () {return this};
console.log(bob === dog);
console.log(bob() === dog());

a)	true true
b)	false false
c)	true false
d)	false true
e)	Error
f)	Write your own answer

12.	What’s the result?

var bob = function () {return this;};
var dog = function () {return this};
var tom = bob;
var tim = dog;
console.log(bob == dog);
console.log(tom == tim);
console.log(tom == bob);
console.log(tim == dog);

a)	true true true true
b)	false false false false
c)	true false true false
d)	false true false true
e)	false false true true
f)	Error
g)	Write your own answer

13.	What’s the result?

var dog = {}; 
function bob (){ 
  return this; 
} 
console.log(bob() == this); 
console.log(bob.call(dog) == dog);
console.log(bob.call(window)==this);

a)	Error
b)	true false false
c)	false true true
d)	true false true
e)	true true false
f)	false false true
g)	false false false
h)	true true true
i)	Write your own answer

14.	What’s the result?

function xx (yy, zz) { 
   for (var i = 0; i < yy.length; i++) {
       zz.call(yy, yy[i] , i);
   } 
} 
var num = 0;
 
xx([0, 1, 2], function (value, i) {
      console.log(value == num++);
      console.log(this instanceof Array); 
});

a)	true true true true true true
b)	true false true false true false
c)	false false false false false false
d)	false true false true false true
e)	Error
f)	Write your own answer

15.	What’s the result?

function xx (yy, zz) { 
   for (var i = 0; i < yy.length; i++) {
       zz(yy[i] , i);
   } 
} 
var num = 0;
 
xx([0, 1, 2], function (value, i) {
      console.log(value == num++);
      console.log(this instanceof Array); 
});

a)	true true true true true true
b)	true false true false true false
c)	false false false false false false
d)	false true false true false true
e)	Error
f)	Write your own answer

16.	What’s the result?

function add (a, b) { 
  return a + b + this.c; 
} ;
var obj1 = {c : 5};
var obj2 = {c : 6};
var c = 7;
console.log(add(1,2));
console.log(add.apply(obj1,1,2));
console.log(add.call(obj2,[1,2]));

a)	NaN Error
b)	NaN NaN NaN
c)	undefined undefined undefined
d)	10 8 9
e)	NaN 8 9
f)	undefined 8 9
g)	Write your own answer

17.	What’s the result?

function add (a, b) { 
  return a + b + this.c; 
} ;
var obj1 = {c : 5};
var obj2 = {c : 6};
var c = 7;
console.log(add(1,2));
console.log(add.apply(obj1,[1,2]));
console.log(add.call(obj2,1,2));

a)	NaN Error
b)	NaN NaN NaN
c)	undefined undefined undefined
d)	10 8 9
e)	NaN 8 9
f)	undefined 8 9
g)	Write your own answer

18.	What’s the result?

function User (first, last){
  this.name = first + " " + last;
}
var user = User("Harry", "Potter");
console.log(user && user.name);

a)	Error
b)	undefined
c)	Harry Potter
d)	Write your own answer
19.	What’s the result?

function Author (first, last){
  this.name = first + " " + last;
}
var au = new Author("JK", "Rowling");
console.log(au && au.name);

a)	Error
b)	undefined
c)	JK Rowling
d)	Write your own answer

20.	What’s the result?

var name = "Potter";
function User (first, last){
  this.name = first + " " + last;
}
var user = User("Harry", name);
console.log(name);

a)	Error
b)	undefined
c)	Harry Potter
d)	Potter
e)	Write your own answer

21.	What’s the result?

var name = "Rowling";
function Author (first, last){
  this.name = first + " " + last;
}
var au = new Author("JK", name);
console.log(name);

a)	Error
b)	undefined
c)	JK Rowling
d)	Rowling
e)	Write your own answer

22.	What should be the missing statement marked by ?????????? to get the desired output?

function xx (args) { 
    // Make an array of all but the first 
    // argument 
    return ??????????; 
}
xx([1,2,3,4]);
Output >> [2,3,4]

a)	Array.slice.call(arguments, 1);
b)	arguments.slice(1)
c)	Array().slice.call(arguments, 1);
d)	Array().slice.call(args, 1);
e)	args.slice(1)
f)	Error
g)	Write your own answer

23.	What should be the missing statement marked by ?????????? to get the desired output?

function xx (args) { 
    // Make an array of all but the first 
    // two arguments 
    return ??????????; 
}
xx(1,2,43);
Output >> [43]

h)	Array.slice.call(arguments, 2);
i)	arguments.slice(2)
j)	Array().slice.call(arguments, 2);
k)	Array().slice.call(args, 2);
l)	args.slice(2)
m)	Error
n)	Write your own answer

24.	What’s the result?

function pizza(){ 
    var slices = 0; 
    this.getSlices = function (){ 
return slices; 
  };
  this.slice = function () { 
        slices++; 
  }; 
} 
var peppy = new pizza(); peppy.slice();
console.log(peppy.slices);
console.log(peppy.getSlices());
peppy.slices = 2;
console.log(peppy.slices);
console.log(peppy.getSlices());

a)	Error
b)	1 1 2 2 
c)	undefined 1 2 2
d)	undefined 1 2 1
e)	Write your own answer












25.	What’s the result?

var a = 5; 
function outer (a) { 
     console.log(a == 6 ? "a" : 0);  
     function inner () { 
       console.log(b == 7 ? "b" : 0);
 console.log(c==undefined ? "c" : 0); 
     }  
     var b = 7; 
     inner(); 
     var c = 8; 
} 
outer(6);  
for (var d = 0; d < 3; d++) { 
       setTimeout(function(){ 
         console.log( d == 3 ? "d" : 0 ); 
       }, 10); 
}

a)	Error
b)	a b c d d d
c)	a b c 0 0 0
d)	a 0 c 0 0 0
e)	a 0 c d d d
f)	Write your own answer

26.	What’s the result?

(function(){ 
  var count = 0;  
  var timer = setInterval(function(){ 
    if ( count < 2 ) { 
      console.log(count); 
      count++; 
    } else { 
      console.log(count); 
      clearInterval(timer); 
    } 
  }, 100); 
})();  
console.log(typeof count == "undefined"); 
console.log( typeof timer == "undefined");

a)	Error
b)	true true 0 1 2
c)	false false 0 1 2
d)	true true  undefined
e)	false false undefined
f)	Write your own answer





27.	What’s the result?

var count = 0; 
for (var i = 0; i<4; i++) { 
  setTimeout(function(){ 
    console.log(i == count++); 
  }, i * 200); 
};

a)	Error
b)	true true true true
c)	false false false false
d)	true false false false
e)	Write your own answer

28.	What’s the result?

var count = 0; 
for (var i = 0; i<4; i++) (function(i){ 
  setTimeout(function(){ 
    console.log(i == count++); 
  }, i * 200); 
})(i);

a)	Error
b)	true true true true
c)	false false false false
d)	true false false false
e)	Write your own answer

29.	What’s the result?

function bob () {}; 
bob.prototype.exists = function () { 
  return true; 
};  
var rob = bob(); 
console.log(rob); 
var mob = new bob(); 
console.log(mob.exists());

a)	Error
b)	undefined true
c)	true true
d)	undefined undefined
e)	Write your own answer













30.	What’s the result?

function bob () {
	  this.exists = function () {
        return true;   
    }
}; 
bob.prototype.exists = function () { 
  return false; 
};  
var rob = bob(); 
console.log(rob.exists()); 
var mob = new bob(); 
console.log(mob.exists());

a)	Error
b)	undefined true
c)	true true
d)	false false
e)	undefined false
f)	Write your own answer

31.	What’s the result?

function bob () {
	  this.status = true;
}; 
var rob = new bob();  
var mob = new bob();
bob.prototype.exists = function () { 
  this.status = false;
  return this; 
};  
console.log(!rob.exists().status);
console.log(!rob.exists().status);  
console.log(mob.exists().status);

a)	Error
b)	true true false
c)	true true true
d)	false false false
e)	true false true
f)	true false false
g)	Write your own answer


32.	What’s the result?

function bob () {
	  this.status = true;
}; 
var rob = new bob();  
bob.prototype.exists = function () { 
  return this.status; 
};  
var mob = new bob();
console.log(rob.exists()); 
console.log(mob.exists());

a)	Error
b)	true undefined
c)	true true
d)	false false
e)	undefined false
f)	Write your own answer
g)	
h)	‘function’
i)	Write your own answer

33.	What’s the result?

function xx () {}; 
var yy = new xx(); 
console.log(typeof yy );   
console.log(yy instanceof xx); 
console.log(yy.constructor);

a)	Error
b)	object true  true
c)	object Error
d)	object true  Error
e)	object true  xx
f)	object true  function xx() {}
g)	Write your own answer

34.	What’s the result?;

function xx () {}; 
var yy = new xx();
var zz = new yy.constructor();
console.log(yy instanceof xx);
console.log(zz instanceof xx); 
console.log(zz instanceof yy);

a)	Error
b)	true false true
c)	true true true
d)	true true false 
e)	true false Error
f)	true true Error
g)	Write your own answer














35.	What’s the result?

var yy = (function (){ 
     function xx(){}; 
     return new xx(); 
})();
var zz = new yy.constructor();
console.log(yy.constructor == zz.constructor);
console.log(yy instanceof xx); 
console.log(zz instanceof xx); 

a)	false false false
b)	true false false
c)	true true true
d)	true Error
e)	true true Error
f)	Error
g)	Write your own answer

36.	What’s the result?

function xx () {this.x = 1};
xx.prototype.gogo = function () {};
function yy () {this.y = 2};
yy.prototype = xx.prototype;
console.log(new yy() instanceof yy);
console.log(new yy() instanceof xx); 

a)	Error
b)	true false
c)	true true
d)	false true
e)	false false
f)	Write your own answer

37.	What’s the result?

function xx () {this.x = 1};
xx.prototype.gogo = function () {};
function yy () {this.y = 2};
yy.prototype = new xx();
console.log(new yy() instanceof yy);
console.log(new yy() instanceof xx); 

a)	Error
b)	true false
c)	true true
d)	false true
e)	false false
f)	Write your own answer





38.	What’s the result?

function xx () {this.x = 1};
xx.prototype.gogo = function () {};
function yy () {this.y = 2};
yy.prototype = xx.prototype;
yy.prototype = {
       gogo : xx.prototype.gog
};
console.log(new yy() instanceof yy);
console.log(new yy() instanceof xx); 

a)	Error
b)	true false
c)	true true
d)	false true
e)	false false
f)	Write your own answer

39.	What’s the result?

function xx () {this.x = 1};
xx.prototype.gogo = function () {
          return this.x
};
function yy () {this.x = 2};
yy.prototype = new xx();
console.log(new yy().gogo()); 

a)	Error
b)	1
c)	2
d)	undefined
e)	null
f)	Write your own answer

40.	What’s the result?

function xx () {this.x = 1};
xx.prototype.gogo = function () {
          return this.x
};
function yy () {};
yy.prototype = new xx();
console.log(new yy().gogo()); 

a)	Error
b)	1
c)	2
d)	undefined
e)	null
f)	Write your own answer








41.	What’s the result stored in r?

var r = [], n = 0, a = 0, b = 1, next;
 
function nextFibonacci() {
    next = a + b;
    return b = (a = b, next);
}
 
while(n++ < 10) {
    r.push(nextFibonacci());
} 

Write your own answer

