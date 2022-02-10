class TwelveDays {
    String verse(int verseNumber) {
        String days[] = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        String verses[] = {" a Partridge in a Pear Tree."," two Turtle Doves,"," three French Hens,"," four Calling Birds,"," five Gold Rings,"," six Geese-a-Laying,"," seven Swans-a-Swimming,"," eight Maids-a-Milking,"," nine Ladies Dancing,"," ten Lords-a-Leaping,"," eleven Pipers Piping,"," twelve Drummers Drumming,"};
        
        String verseNo[] = new String[12];
        for(int iIndex = 1; iIndex <= 12 ; iIndex+=1 ){
            String temp = "On the "+days[iIndex-1]+" day of Christmas my true love gave to me:";
            for(int jIndex = iIndex; jIndex >=1 ; jIndex-=1){
                if(iIndex == 1){
                    temp += verses[iIndex-1];
                    break;
                }
                if(jIndex == 1){
                    temp+= " and";
                }
                temp+= (verses[jIndex-1]);
                
            }
            verseNo[iIndex-1]=temp+"\n";
        }
        return verseNo[verseNumber-1];
        
    }
    String verses(int startVerse, int endVerse) {
        String verseFromStartToEnd = "";
        for(int index=startVerse; index<=endVerse ; index++){
            verseFromStartToEnd += verse(index);
            if(index!=endVerse)
            verseFromStartToEnd += "\n";
            
        }
        return verseFromStartToEnd;
    }
    
    String sing() {
        return verses(1,12);
        
    }
}