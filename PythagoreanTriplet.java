import java.util.*;

class PythagoreanTriplet {
    int a;
    int b;
    int c;
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        return this.a == ((PythagoreanTriplet) obj).a &&this.b == ((PythagoreanTriplet) obj).b &&this.c == ((PythagoreanTriplet) obj).c;
    }
    static List<PythagoreanTriplet> triplets;
    PythagoreanTriplet(){
        
        triplets = new ArrayList<PythagoreanTriplet>();
    }
    PythagoreanTriplet(List<PythagoreanTriplet> triplets){
        
        this.triplets = triplets;
    }
    PythagoreanTriplet(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    static PythagoreanTriplet makeTripletsList(){
        return new PythagoreanTriplet();
    }
    static PythagoreanTriplet withFactorsLessThanOrEqualTo(int num){
        for(int iIndex=1;iIndex<=num;iIndex++){
            for(int jIndex=1;jIndex<=num;jIndex++){
                int kIndex = iIndex*iIndex + jIndex*jIndex;
                double kRoot = Math.sqrt(kIndex);
                if(kRoot == Math.ceil(kRoot)){
                    if(iIndex<jIndex){
                    triplets.add(new PythagoreanTriplet(iIndex,jIndex,(int)kRoot));
                        }
                }
            }
        }
        return new PythagoreanTriplet(triplets);
    }
    static PythagoreanTriplet thatSumTo(int num){
        int index=0;
        while(index<triplets.size()){
            if(triplets.get(index).a+triplets.get(index).b+triplets.get(index).c!=num){
                triplets.remove(index);
                continue;
            }
            index++;
        }
        return new PythagoreanTriplet(triplets);
    }
    static List<PythagoreanTriplet> build(){
        return triplets;
    }
    
}
