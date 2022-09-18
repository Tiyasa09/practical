package activity;

 class Example {
	int marks() {
		return 0;
	}}
class comp extends Overridingeg{
	int marks() {
		return 80;
	}}
class Math extends Overridingeg{
	int marks() {
		return 70;
	}}
class science extends Overridingeg{
	int marks() {
		return 50;
	}}
class eng extends Overriding{
	int marks() {
		return 90;
	}}
class  Overridingeg{
public static void main(String args[]) {
	comp c=new comp();
	Math m=new Math();
	science s=new science();
	eng e=new eng();
	System.out.println("computer mark:"+c.marks());
	System.out.println("math mark:"+m.marks());
	s.marks();
	e.marks();
	
}}
