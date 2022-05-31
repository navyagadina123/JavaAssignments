//package com.cg.java11;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class quest4 {
//public static  void main(String args[])
//{
//	Var path ="C:\\Users\\NGADINA\\Downloads\\Java11Assignments_StudentList.txt";
//	try {
//		 var  data=Files.readString(Path.of(path));
//		//System.out.println(data);
//		//data.if(data!=null).forEach(d->System.out.println(d.count()));
//		List<String>str=data.stream().map(s->s.trim()).filter(s->!s.isEmpty()).collect(Collectors.toList());
//		for(String s:str)
//		{
//			System.out.println(s);
//		}
//		System.out.println("no.of students are "+str.size());
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//}
