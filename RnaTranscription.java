class RnaTranscription {
    String transcribe(String dnaStrand) {
        char dnaStrandArray[] = new char[dnaStrand.length()];
        for(int index=0;index<dnaStrand.length();index++){
            dnaStrandArray[index] = dnaStrand.charAt(index);
        }
        char temp = ' ';
        for(int index = 0; index<dnaStrand.length();index++){
            switch(dnaStrandArray[index]){
                case 'G':
                    temp = 'C';
                    break;
                case 'C':
                    temp = 'G';
                    break;
                case 'T':
                    temp = 'A';
                    break;
                case 'A':
                    temp = 'U';
                    break;
            } 
            dnaStrandArray[index] = temp;
        }
        return String.valueOf(dnaStrandArray);
    }
}