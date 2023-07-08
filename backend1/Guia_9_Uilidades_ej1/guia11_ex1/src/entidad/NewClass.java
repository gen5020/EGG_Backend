///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package entidad;
//
///**
// *
// * @author User
// */
//public class NewClass {
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        Perro m1 = new Perro("neron", "Pitbull", 6, sexoAnimal.MACHO, tamanioPerro.GRANDOTE);
//        Perro m2 = new Perro("Mila", "Galgo", 5, sexoAnimal.HEMBRA, tamanioPerro.GRANDE);
//        Perro m3 = new Perro("Coco", "Caniche", 2, sexoAnimal.HEMBRA, tamanioPerro.CHIQUITO);
//        Perro m4 = new Perro("Gene", "buldog", 2, sexoAnimal.HEMBRA, tamanioPerro.MEDIANO);
//        Perro m5 = new Perro("lalo", "Chihuahua", 1, sexoAnimal.MACHO, tamanioPerro.CHIQUITO);
//        Perro m6 = new Perro("paul", "Orejon", 7, sexoAnimal.OTRO, tamanioPerro.MEDIANO);
//
//        ArrayList<Perro> adoptar = new ArrayList<>();
//        adoptar.add(m1);
//        adoptar.add(m2);
//        adoptar.add(m3);
//        adoptar.add(m4);
//        adoptar.add(m5);
//        adoptar.add(m6);
//
//        ArrayList<Perro> adoptado = new ArrayList<>();
//
//        Persona p1 = new Persona("Gabriela", "Arias", 19, 42058475, null);
//        Persona p2 = new Persona("Noelia", "Guevara", 19, 42058476, null);
//        Persona p3 = new Persona("Fernando", "Barale", 19, 42058575, null);
//        Persona p4 = new Persona("Daniel", "Parra", 19, 42558475, null);
//        Persona p5 = new Persona("Juan", "Aria", 19, 43058475, null);
//        Persona p6 = new Persona("Marcos", "Robles", 19, 42099475, null);
//
//        ArrayList<Persona> adoptante = new ArrayList<>();
//        adoptante.add(p1);
//        adoptante.add(p2);
//        adoptante.add(p3);
//        adoptante.add(p4);
//        adoptante.add(p5);
//        adoptante.add(p6);
// boolean salir = true;
//        do {
//           
//            for (Persona adop : adoptante) {
//                System.out.println("Bienveni@ " + adop.getNombre() + " Tenemos los siguientes perritos para adoptar");
//                System.out.println(adoptar.toString());
//                System.out.println("-----------------------------------------------------------------------------");
//                System.out.println("Ingrese el nombre del perrito que quiere adoptar: ");
//                String nombrep = leer.next();
//                if (adoptado.contains(p6)) {
//                    System.err.println("El perrito ya fue adoptado, elija otro");
//                } else {
//                    Iterator<Perro> it = adoptar.iterator();
//                    while (it.hasNext()) {
//                        if (it.next().getNombre().equalsIgnoreCase(nombrep)) {
//                            adop.setPerro(it.next());
//                            adoptado.add(it.next());
//                        }
//                    }
//                }
//            }
//            System.out.println("desea continuar? S/N");
//            if (leer.next().equalsIgnoreCase("N")) {
//                salir = false;
//            }
//        } while (salir);
//
//        System.out.println("Perritos adoptados " + adoptado.toString());
//        System.out.println("Perritos adoptados " + adoptante.toString());
//
//    }
//}
