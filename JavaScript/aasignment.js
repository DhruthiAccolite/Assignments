//use of function
function Employee(fname,lname,age,address)
{
	this.firstname=prompt("Enter first name");
	this.lastname=prompt("Enter last name");
	this.age=prompt("Enter age");
	this.address=prompt("Enter address");
};

//use of prototype
Employee.prototype.employeeinfo=function()
{
    console.log("First Name " +  this.firstname);
    console.log("Last Name " + this.lastname);
    console.log("Age " + this.age);
    console.log("Address " + this.address);
}

function employeeworkdetail(id,designation,email,number)
{
    this.employeeid=prompt("Enter employee id");
    this.designation=prompt("Enter designation");
	this.email=prompt("Enter email");
	this.number=prompt("Enter number");
};

employeeworkdetail.prototype.information=function()
{
    console.log("Employee Id " + this.employeeid);
    console.log("Designation " + this.designation);
    console.log("Email " + this.email);
    console.log("Number " + this.number);
};

alert("Details for employee 1");
var employee1= new Employee();
alert("Details for employee 2");
var employee2 = new Employee();
alert("Details for employee 3");
var employee3 = new Employee();
alert("Details of employee 1")
employee1.employeeinfo();
alert("Work details for employee 1");
var employeeworkdetail1=new employeeworkdetail();
alert("Work details for employee 2");
var employeeworkdetail2=new employeeworkdetail();
alert("Work details for employee 3");
var employeeworkdetail3=new employeeworkdetail();

//use assign method
var employeedetail1=Object.assign(employee1,employeeworkdetail1);
var employeedetail2=Object.assign(employee2,employeeworkdetail2);
var employeedetail3=Object.assign(employee3,employeeworkdetail3);

alert("Employee 1 details in console")
console.log( employeedetail1);

alert("Employee 2 details in console")
var employee= employeeworkdetail2.information;
//use of call
employee.call(employeeworkdetail2);

var Manager= [];
var Hr= [];

//push,unshift
//use of IIFE
(function(){
	Manager.push(employeedetail1);
    Manager.unshift(employeedetail2);
    Hr.push(employeedetail3);
})();

var departmentinfo=function(item){
	console.log(item);
};

alert("Details of manager");
//use of forEach
Manager.forEach(departmentinfo);


//__proto__ to add propery 
employeeworkdetail1.__proto__.project=prompt("Enter project name for employee1");
employeeworkdetail1.information();
alert("Project name of employee 1 in console")
console.log("Project name " +employeeworkdetail1.project )

//use of delete
delete employeeworkdetail1.lname;
alert("Details of employee 1 in console without last name in console");
console.log(employeeworkdetail1);