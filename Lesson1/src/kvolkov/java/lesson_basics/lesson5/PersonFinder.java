package kvolkov.java.lesson_basics.lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class PersonFinder {
	
	private static final String[] sNames = {
			"Анатолий",
			"Афанасий",
			"Борис",
			"Григорий",
			"Владимир",
			"Дмитрий",
			"Егор",
			"Жорик",
			"Зигфрид",
			"Инна",
			"Кристина",
			"Лена",
			"Маргарита",
			"Никифор",
			"Олеся",
			"Фотий",
			"Прохор",
			"Яна"		
	};
	
	private static final String[] sSurnames = {
			"Алибаба",
			"Безбашенный",
			"Гребенщиков",
			"Хлебс",
			"Влес",
			"Заволодько",
			"Мирный",
			"Несуществующий",
			"Домовой",
			"Уличный",
			"Праздничный",
			"Сказочная",
			"Капризная"		
	};
	
	public static class Person {
		private String mName;
		private String mSurname;
		
		public Person(String name, String surname) {
			mName = name;
			mSurname = surname;
		}
		
		public String toString() {
			return mName + " " + mSurname;
		}
	}
	
	static final int MAX_ITEMS = 1000000;	
	Map<String, PersonFinder.Person> mPersonMap = new HashMap<>(MAX_ITEMS, 20.f);
	
	public void initPersonMap() {
		Random random = new Random();
		for (int i = 0; i < MAX_ITEMS; ++i) {
			Person person = new Person(sNames[random.nextInt(sNames.length)],
					   sSurnames[random.nextInt(sSurnames.length)]);
			
			mPersonMap.put(person.mName, person);
		}
		System.out.println("Person map created");
	}
	
	public void findPersonByName(String name) {
		System.out.print("Found: " + mPersonMap.get(name));
	}


	public static class IndexedPerson {
		static int id = 0;
		private String mName;
		private String mSurname;
		private int mUuid;
		
		public IndexedPerson(String name, String surname) {
			mName = name;
			mSurname = surname;
			mUuid = ++id;
		}
		
		public String toString() {
			return mName + mUuid + " " + mSurname;
		}
		
		@Override
		public int hashCode() {
			return 32 * mName.hashCode() + 32 * mUuid;
		}
	}
		
	Map<PersonFinder.IndexedPerson, PersonFinder.IndexedPerson> mIndexedPersonMap = new HashMap<>();

	public void initPersonMapWithIds() {		
		Random random = new Random();
		for (int i = 0; i < MAX_ITEMS; ++i) {
			IndexedPerson person = new IndexedPerson("Никифор",
					   sSurnames[random.nextInt(sSurnames.length)]);
			
			mIndexedPersonMap.put(person, person);
		}
		System.out.println("Person map with IDs created");
	}
	
	public void findIndexedPersonByName(String name) {
//		Set<PersonFinder.IndexedPerson> keys = mIndexedPersonMap.keySet();
//		System.out.println("Found " + keys.size() + " keys");
//		for (PersonFinder.IndexedPerson key : keys) {
//			System.out.println("Key = " + key);
//		}
		IndexedPerson p;
		int hash = 32 * name.hashCode();
		for (int i = 0; i < MAX_ITEMS; ++i) {
			p = mIndexedPersonMap.get(hash + 32 * i);
			if (p != null) {
				System.out.print("Found: " + p);
			}
		}
	}

}
