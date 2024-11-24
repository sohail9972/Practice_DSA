package ProjectGurgram.collectionFrameWorks.HashSet;

import ProjectGurgram.StringsProblems.StringKunals1;

import java.util.LinkedList;

public class CustomizedHashTable {
    public static void main(String[] args) {

        CustomHashTable<String, String> hashTable =new CustomHashTable<>(10);
        // Add key-value pairs
        hashTable.put("name", "Alice");
        hashTable.put("age", "25");
        hashTable.put("city", "New York");

        // Retrieve and display values
        System.out.println("Name: " + hashTable.get("name")); // Alice
        System.out.println("Age: " + hashTable.get("age"));   // 25

        // Remove a key-value pair
        hashTable.remove("age");
        System.out.println("After removing 'age':");

        // Display the entire hash table
        hashTable.display();

    }

   static class CustomHashTable<K,V>{
//        Entry Class to store the Key and Values
        private static class Entry<K,V>{
            K key;
            V value;


            Entry(K key,V value){
                this.key =key;
                this.value=value;
            }
        }

//        Array of LinkedLists

        private LinkedList<Entry<K,V>>[] buckets;
        private int capacity;
        private int size;


        public CustomHashTable(int capacity){
            this.capacity=capacity;
            buckets = new LinkedList[capacity];
            for (int i=0;i<capacity;i++){
                buckets[i]=new LinkedList<>();
            }
        }

//      writing the Hash function
        private int hash(K key){
            return Math.abs(key.hashCode() % capacity);
        }

//        now We are Inserting and updating the Key-Value Pair

        public void put(K key,V value){
            int index =hash(key);
            LinkedList<Entry<K,V>> EachBucket = buckets[index];


//            checking if Key already Exists
            for (Entry<K,V> entry : EachBucket){
                if (entry.key.equals(key)){
                    entry.value = value;    //Updating the  existing Value
                    return;
                }
            }

//            Adding next Key-Value Pair
            EachBucket.add(new Entry<>(key,value));
            size++;

        }

//        Retrieve value for the given Key
        public V get(K key){
            int index =hash(key);
            LinkedList<Entry<K,V>> EachBucket = buckets[index];

            for (Entry<K,V> entry:EachBucket){
                if (entry.key.equals(key)){
                    return entry.value;
                }
            }
//            if key not found
            return null;
        }

//        remove Key-Value Pair
        public boolean remove(K key){
            int index = hash(key);
            LinkedList<Entry<K,V>> EachBucket = buckets[index];

            for (Entry<K,V> entry:EachBucket){
                if (entry.key.equals(key)){
                    EachBucket.remove(entry);
                    size--;
                    return true;
                }
            }
            return false;
        }

//        Get current size of the hash table
        public int size(){
            return size;
        }

//        printing the contents of the HashTable
        public void display(){
            for (int i=0;i<capacity;i++){
                System.out.println("Bucket "+ i +": ");
                for (Entry<K,V>entry : buckets[i]){
                    System.out.println("{" + entry.key + "="+ entry.value + "}");
                }
                System.out.println();
            }
        }
    }
}
