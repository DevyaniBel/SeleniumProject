package com.demo.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.List;


public class ArraylistExercide implements Cloneable {

	public static void main(String[] args) {

		//ArrayList y = new ArrayList();
		//List<Object> list_Strings = new ArrayList<Object>();
		List<String> list_Strings = new ArrayList<String>();
		//List<Integer> list_Strings = new ArrayList<Integer>();
		//list_Strings.add(100);
		list_Strings.add("Orange");
		list_Strings.add("Orange");
		list_Strings.add("Black");
		list_Strings.add(""); //instance method because called by object
		list_Strings.add("Blue");
		System.out.println(list_Strings);

		List<String> list_StringsItr = new ArrayList<String>();
		//List<Integer> list_Strings = new ArrayList<Integer>();
		//list_Strings.add(100);
		list_StringsItr.add("Orange");
		list_StringsItr.add("Orange");
		list_StringsItr.add("Black");
		list_StringsItr.add("Blue");

		for (String element : list_StringsItr) {
			System.out.println(element);
		}

		/*Insert an ele in first and last element*/
		//create list and add some colors into list
		List<String> list_StringsPosition = new ArrayList<String>();
		//List<Integer> list_Strings = new ArrayList<Integer>();
		//list_Strings.add(100);
		list_StringsPosition.add("Orange");
		list_StringsPosition.add("Orange");
		list_StringsPosition.add("Black");
		list_StringsPosition.add("Blue");
		System.out.println(list_StringsPosition);

		list_StringsPosition.add(0, "Pink");
		list_StringsPosition.add(3, "Yellow");

		System.out.println(list_StringsPosition);


		// to retreive the element

		List<String> list_StringsRetrieve = new ArrayList<String>();
		//List<Integer> list_Strings = new ArrayList<Integer>();
		//list_Strings.add(100);
		list_StringsRetrieve.add("Orange");
		list_StringsRetrieve.add("Orange");
		list_StringsRetrieve.add("Black");
		list_StringsRetrieve.add("Blue");
		System.out.println(list_StringsRetrieve);

		//REtrieve first and third element

		String element = list_StringsRetrieve.get(0);
		System.out.println("First element " + element);

		element = list_StringsRetrieve.get(3);
		System.out.println("Second element " + element);

		//to update the element
		List<String> list_StringsUpdate = new ArrayList<String>();
		list_StringsUpdate.add("Orange");
		list_StringsUpdate.add("Orange");
		list_StringsUpdate.add("Black");
		list_StringsUpdate.add("Blue");
		System.out.println(list_StringsUpdate);
		list_StringsUpdate.set(2, "white");
		System.out.println(list_StringsUpdate);

		//to remove element
		List<String> list_StringsRemove = new ArrayList<String>();
		list_StringsRemove.add("Orange");
		list_StringsRemove.add("Orange");
		list_StringsRemove.add("Black");
		list_StringsRemove.add("Blue");
		System.out.println(list_StringsRemove);
		list_StringsRemove.remove(2);
		System.out.println("After removing element print again "+list_StringsRemove);

		//search an emelent in the list
		List<String> list_StringsSearch = new ArrayList<String>();
		list_StringsSearch.add("Orange");
		list_StringsSearch.add("Orange");
		list_StringsSearch.add("Black");
		list_StringsSearch.add("Blue");


		if(list_StringsSearch.contains("Blue")) {
			System.out.println("found elemenet");
		}else {
			System.out.println("There is no such elemnt");
		}

		///sort the element
		List<String> list_StringsSort = new ArrayList<String>();
		list_StringsSort.add("Orange");
		list_StringsSort.add("Orange");
		list_StringsSort.add("Black");
		list_StringsSort.add("Blue");
		System.out.println("before "+ list_StringsSort);
		Collections.sort(list_StringsSort);
		System.out.println("After"+list_StringsSort );

		//copy list 1 to list2
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		List1.add("5");
		System.out.println("List 1 "+ List1);
		List<String> List2 = new ArrayList<String>();
		List2.add("a");
		List2.add("b");
		List2.add("c");
		List2.add("d");
		List2.add("e");
		System.out.println("List 2 " + List2);
		Collections.copy(List2, List1);
		System.out.println("Print List after copy");
		System.out.println(List1);
		System.out.println(List2);

		//shuffle
		List<String> list_StringsShuffle = new ArrayList<String>();
		list_StringsShuffle.add("Orange");
		list_StringsShuffle.add("Orange");
		list_StringsShuffle.add("Black");
		list_StringsShuffle.add("Blue");
		Collections.shuffle(list_StringsShuffle);
		System.out.println("after shuffling "+list_StringsShuffle);


		//reverse
		List<String> list_StringsReverse = new ArrayList<String>();
		list_StringsReverse.add("Orange");
		list_StringsReverse.add("Orange");
		list_StringsReverse.add("Black");
		list_StringsReverse.add("Blue");
		Collections.reverse(list_StringsReverse);
		System.out.println("after reverse "+list_StringsReverse);

		//sub portion
		List<String> list_StringsSubPortion = new ArrayList<String>();
		list_StringsSubPortion.add("Orange");
		list_StringsSubPortion.add("Orange");
		list_StringsSubPortion.add("Black");
		list_StringsSubPortion.add("Blue");
		System.out.println("Original list" + list_StringsSubPortion);
		List<String> sub_List = list_StringsSubPortion.subList(0, 3);
		System.out.println(sub_List);


		//compare to arraylist
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("red");
		c1.add("violet");
		c1.add("blue");
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("red");
		c2.add("violet");
		c2.add("blue");
		//storing and comparison
		ArrayList<String> c3 = new ArrayList<String>();
		for(String e : c1)
			c3.add(c2.contains(e) ? "yes" : "no");
		System.out.println(c3);
		//swap the list
		ArrayList<String> s1 = new ArrayList<String>();		
		s1.add("red");
		s1.add("violet");
		s1.add("blue");
		for (String a : s1) {
			System.out.println(a);
		}
		Collections.swap(s1, 0, 2);
		System.out.println("After swap" );

		for (String b : s1) {
			System.out.println(b);
		}

		//////////join two array list
		ArrayList<String> k1 = new ArrayList<String>();
		k1.add("red");
		k1.add("violet");
		k1.add("blue");
		ArrayList<String> k2 = new ArrayList<String>();
		k2.add("pink");
		k2.add("yellow");
		k2.add("black");
		//join two
		ArrayList<String> s = new ArrayList<String>();
		s.addAll(k2);
		s.addAll(k1);
		System.out.println(s);

		///clone
		ArrayList<String> m1 = new ArrayList<String>();
		m1.add("red");
		m1.add("violet");
		m1.add("blue");
		ArrayList<String> nw1 = (ArrayList<String>)m1.clone();
		System.out.println("clone array list "+ nw1);

		//Empty array list

		ArrayList<String> p1 = new ArrayList<String>();
		p1.add("red");
		p1.add("violet");
		p1.add("blue");
		p1.removeAll(p1);
		System.out.println(p1);
		if(p1.isEmpty()) {
			System.out.println("Arraylist is empty");
		}else {
			System.out.println("Arraylist is not empty");
		}

	}
}

