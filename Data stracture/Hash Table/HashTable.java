public class HashTable {

    //ht[] :: is the HashTable array that stores the PairNode objects
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
    //DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
    //DO NOT change this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
    //This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair){
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }
    //you need to COMPLETE this method
    private int hashFunction( String key ){

    String x=key;

    int len=x.length();
        Integer Sum=0;
    if (len%2==0){

    for ( int i=0;i<len;i+=2){

    Integer j =(int)x.charAt(i);
    Integer l=(int)x.charAt(i+1);
    //char g=j;
    //char k=l;
    String su=Integer.toString(j)+Integer.toString(l);
Sum=Sum+Integer.parseInt(su);

    }
    }
    else{
        int c=0;
        for ( int i=0;i<len-1;i+=2){
            Integer j =(int)x.charAt(i);
            Integer l=(int)x.charAt(i+1);
            String su=Integer.toString(j)+Integer.toString(l);
            Sum=Sum+Integer.parseInt(su);

c=i;
        }
        Integer o=(int)x.charAt(c+1) ;
        Integer n=(int)'N';
        String suh=(Integer.toString(o))+(Integer.toString(n));
        Sum=Sum+Integer.parseInt(suh);
    }




        // TO DO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        return Sum%ht.length; //remove this line

    }


    //you need to COMPLETE this method
    //Hint: you may need to use Integer.parseInt() to convert from String to Integer
    public String searchHashtable( Object[] keyValuePair ){

    String key=(String)keyValuePair[0];
    int inde=hashFunction( key);
    if (ht[inde]==null){
    return " not found";
    }


    else if (ht[inde].key.equals(key)){
    return "found";
    }
    else{
    PairNode temp=ht[inde];
    int count=0;
    while(temp!=null){
    if (ht[inde].key.equals(key)){
    return "found";
    }

    temp=temp.next;
    }

    return "Not found";
    }




        // TO DO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        //it'll return either "Found" or "Not Found"
        //return null; // remove this line

    }

}

