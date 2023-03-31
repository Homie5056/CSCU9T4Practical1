// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private final List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
public String findentriesbydate(int d, int m, int y) {
    List<Entry> entriesOnDate = new ArrayList<>();
    for (Entry entry : tr) {
        if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
            entriesOnDate.add(entry);
        }
    }
    if (entriesOnDate.isEmpty()) {
        return "No entries found";                                                             //added method
    } else {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entriesOnDate) {
            sb.append(entry.toString()).append("\n");
        }
        return sb.toString();
    }
}

   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord