import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Car,MachineData> hashMap = new HashMap<>();
        hashMap.put(new Car(1,888),new MachineData(2020,"Mini Cooper",35000,"Dark green"));
        for (Map.Entry<Car,MachineData> i : hashMap.entrySet()){
            System.out.println(i);
        }

        ArrayList<City>arrayList = new ArrayList<>();
        arrayList.add(new City(996,"Kyrgyzstan"));
        arrayList.add(new City(212,"New York"));
        arrayList.add(new City(7,"Russia"));
        arrayList.add(new City(44,"London"));
        arrayList.add(new City(81,"Japan"));
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getCode()%2==1){
                System.out.println(arrayList.get(i));

            }
            }

        }
        }



