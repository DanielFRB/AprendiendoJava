package com.dfrb.java8features.collectors;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado {
    public static void main(String[] args) {
        // Creamos un ArrayList de tipo Empleado
        List<Empleado> listaEmpleados = new ArrayList<>();
        
        // Agregamos objetos de tipo Empleado al ArrayList
        listaEmpleados.add(new Empleado(100, "Daniel", 47, "North America", 45000));
        listaEmpleados.add(new Empleado(200, "Yaneth", 51, "North America", 50000));
        listaEmpleados.add(new Empleado(300, "Oswaldo", 21, "South America", 45000));
        listaEmpleados.add(new Empleado(400, "Barack", 9, "Africa", 45000));
        
        // Usando el metodo toList()
        List<String> listaNombres = listaEmpleados.stream()
                .map((e) -> e.getNombre())
                .collect(Collectors.toList());
        
        System.out.println("List de Nombres: "+ listaNombres);
        
        // Usando el metodo toSet()
        Set<String> regionSet = listaEmpleados.stream().
                map((e) -> e.getRegion())
                .collect(Collectors.toSet());
        
        System.out.println("Set de Regiones: "+ regionSet);
        
        // Usando el metodo toUnmodifiableList() para crear un Set No Modificable
        Set<Double> setNoModificable = listaEmpleados.stream()
                .map((e) -> e.getSalario())
                .collect(Collectors.toUnmodifiableSet());
        
        System.out.println("UnmodifiableSet de Nombres: "+ setNoModificable);
        
        // La siguiente linea produce un error al intentar agregar un valor a un Set inmutable
        // noModificableSet.add(48000d);
        
        // Usando el metodo toUnmodifiableList() para crear una List No modificable
        List<Double> listaNoModificable = listaEmpleados.stream()
                .map((e) -> e.getSalario())
                .collect(Collectors.toUnmodifiableList());
        
        System.out.println("UnmodifiableList de Nombres: "+ listaNoModificable);
        
        // Ejemplo para recopilar los nombres a una LinkedList en lugar de una List predeterminada.
        List<String> listaEnlazadaNombres = listaEmpleados.stream()
                .map((e) -> e.getNombre())
                .collect(Collectors.toCollection(LinkedList::new));
        
        System.out.println("LinkedList de Nombres: "+ listaEnlazadaNombres);
        
        // Ejemplo para recopilar las regiones en un TreeSet en lugar de un Set predeterminado.
        Set<String> regionTreeSet = listaEmpleados.stream()
                .map((e) -> e.getRegion())
                .collect(Collectors.toCollection(TreeSet::new));
        
        System.out.println("TreeSet de Regiones: "+ regionTreeSet);
        
        // Convirtiendo el stream de Empleados a un Map
        Map<Integer, Empleado> mapaEmpleados = listaEmpleados.stream()
                .collect(Collectors.toMap((e) -> e.getId(), Function.identity()));
        
        System.out.println("Map de Empleados: "+ mapaEmpleados);
        
        // Se agrega un nuevo empleado con id ya existente
        // listaEmpleados.add(new Empleado(400, "Larry Page", 59, "Asia", 450000));
        
        // Se utiliza el BinaryOperator que es invocado cuando la misma clave aparece repetida
        // En este ejemplo se le indica al BinanyOperator que es una funcion lamba que devuelva
        // el primer ID encontrado en la List
        Map<Integer, Empleado> mapaEmpDuplicado = listaEmpleados.stream()
                .collect(Collectors.toMap((e) -> e.getId(), 
                        Function.identity(), (orig, rep) -> orig));
        
        System.out.println("Map de Empleados con IDs duplicado: "+ mapaEmpDuplicado);
        
        // Usando el metodo toUnmodifiableMap() para crear un Map No modificable
        // A diferencia de Map anterior, aqui el BinaryOperator devuelve el ID repetido
        Map<Integer, Empleado> mapNoModificable = listaEmpleados.stream()
                .collect(Collectors.toUnmodifiableMap(Empleado::getId, 
                        Function.identity(), (orig, rep) -> rep));
        
        System.out.println("UnmodifiableMap de Empleados: "+ mapNoModificable);
        
        // En este caso devolvemos un TreeMap, el cual es ordenado por el ID
        // Se usa un mapSupplier para especificar que debe retornar un TreeMap
        // Sustituimos la Function.identity() por una lambda que nos da el mismo comportamiento.
        Map<Integer, Empleado> mapOrdEmpleados = listaEmpleados.stream()
                .collect(Collectors.toMap((e) -> e.getId(), 
                        emp -> emp, (orig, rep) -> orig, TreeMap::new));
        
        System.out.println("TreeMap de Empleados: "+ mapOrdEmpleados);
        
        // Encontrar la suma de los ID's de todos los Empleados usando el metodo summingInt()
        // Este metodo devuelve un tipo Integer
        int sumaIDsEmpleados = listaEmpleados.stream()
                .collect(Collectors.summingInt(Empleado::getId));
        
        System.out.println("SummingInt IDs de Empleados: "+ sumaIDsEmpleados);
        
        // Encontrar la suma de los Salarios de los Empleados usando el metodo summingDouble()
        // Este metodo devuelve un tipo Double
        double sumaSueldos = listaEmpleados.stream()
                .collect(Collectors.summingDouble((e) -> e.getSalario()));
        
        System.out.println("SummingDouble Sueldos de Empleados: "+ sumaSueldos);
        
        // Encontrar el promedio de edad de los Empleados usando el metodo averagingInt()
        // Este metodo devuelve un tipo Double
        double promedioEdad = listaEmpleados.stream()
                .collect(Collectors.averagingInt(Empleado::getEdad));
        
        System.out.println("AveragingInt Edad de Empleados: "+ promedioEdad);
        
        // Encontrar el numero de Empleados en el ArrayList usando el metodo counting()
        // Este metodo devuelve un tipo Long
        long totalEmpleados = listaEmpleados.stream()
                .collect(Collectors.counting());
        
        System.out.println("Counting de Empleados: "+ totalEmpleados);
        
        // Ejemplo del metodo joining(), devuelve un tipo String
        // Se usa un delimitador dentro del metodo
        String strNombresEmp = listaEmpleados.stream()
                .map((e) -> e.getNombre())
                .collect(Collectors.joining(" + "));
        
        System.out.println("Joining Nombres de Empleados: "+ strNombresEmp);
        
        // Usando el metodo groupingBy() para aprupar por propiedades o campos especificos
        // Funciona de la misma forma que la sentencia SQL GROUP BY
        // Por defecto los valores del Map son almacenados en una List
        Map<String, List<Empleado>> grupoPorRegion = listaEmpleados.stream()
                .collect(Collectors.groupingBy(Empleado::getRegion));
        
        System.out.println("GroupingBy List por Region: "+ grupoPorRegion);
        
        // Se puede modificar que el valor del Map sea almacenado en un Set a diferecia del List por defecto
        Map<String, Set<Empleado>> grupoPorRegionSet = listaEmpleados.stream()
                .collect(Collectors.groupingBy(Empleado::getRegion, 
                        Collectors.toSet()));
        
        System.out.println("GroupingBy Set por Region: "+ grupoPorRegionSet);
        
        // Uso del metodo partitioningBy(), este metodo retorna un Map con clave Boolean y un
        // List como valor, el Map retornado siempre contiene mapeos de ambos valores (true or false)
        Map<Boolean, List<Empleado>> particionadoPorEdad = listaEmpleados.stream()
                .collect(Collectors.partitioningBy((e) -> e.getEdad() > 25));
        
        System.out.println("PartitioningBy List por Edad: "+ particionadoPorEdad);
        
        // Set as Map value
        Map<Boolean, Set<Empleado>> partitionByAgeSet = listaEmpleados.stream()
                .collect(Collectors.partitioningBy( e -> e.getEdad() > 30, 
                        Collectors.toSet()));
        
        System.out.println("PartitioningBy Set por Edad: "+ partitionByAgeSet);

        // LinkedList as Map value
        Map<Boolean, LinkedList<Empleado>> partitionByAgeLinedList = listaEmpleados.stream()
                .collect(Collectors.partitioningBy( e -> e.getEdad() > 30, 
                        Collectors.toCollection(LinkedList::new)));
        
        System.out.println("PartitioningBy LinkedList por Edad: "+ partitionByAgeLinedList);

        // TreeSet as Map value
        Map<Boolean, TreeSet<Empleado>> partitionByAgeTreeSet = listaEmpleados.stream()
                .collect(Collectors.partitioningBy( e -> e.getEdad() > 30, 
                        Collectors.toCollection(TreeSet::new)));
        
        System.out.println("PartitioningBy TreeSet por Edad: "+ partitionByAgeTreeSet);
        
        // Uso del metodo toConcurrentMap() para almacenar el resultado en un Concurrent Map
        Map<Integer, Empleado> empConcurrentMap = listaEmpleados.stream()
                .collect(Collectors.toConcurrentMap((e) -> e.getId(), 
                        Function.identity()));
        
        System.out.println("ConcurrentMap de Empleado: "+ empConcurrentMap);
        
        // Uso del metodo filtering()
        List<Empleado> filtroEmpleadoEdad = listaEmpleados.stream()
                .collect(Collectors.filtering((e) -> e.getEdad() > 25, 
                        Collectors.toList()));
        
        System.out.println("Filtering List de Empleados: "+ filtroEmpleadoEdad);
        
        // Uso de los metodos maxBy() y minBy() para encontrar el maximo y minimo elemento
        // Se debe pasar un Comparator como argumento
        // La Clase Empleado debe implementar la interface Compabable y desarrollar el metodo compareTo()
        Comparator<Empleado> empComparador = (e1, e2) -> e1.getId() - e2.getId();
        Optional<Empleado> empMaxId = listaEmpleados.stream()
                .collect(Collectors.maxBy(empComparador));
        
        if (empMaxId.isPresent()) {
            System.out.println("Maximo Id Empleado: "+ empMaxId.get());
        }
        
        Optional<Empleado> empMinId = listaEmpleados.stream()
                .collect(Collectors.minBy(empComparador));
        
        if (empMinId.isPresent()) {
            System.out.println("Minimo Id Empleado: "+ empMinId.get());
        }
        
        // Uso del metodo reducing(), este retorna un Collector que realiza una reduccion
        // de sus elementos de entreda bajo un BinaryOperator espeficico. El resultado es
        // descrito como un Optional.
        Optional<Empleado> reduccion = listaEmpleados.stream()
                .collect(Collectors.reducing(BinaryOperator.minBy(empComparador)));
        
        if (reduccion.isPresent()) {
            System.out.println("Minimo Id Empleado usando el metodo reducing(): "+ reduccion.get());
        }
        
        // Metodos summarizingDouble(), summarizingInt() y summarizingLong()
        // Estos metodos retornan un DoubleSummaryStatistics, el cual contiene
        // conteo, minimo, maximo, sumatoria y el promerio de todos los valores double en el stream
        DoubleSummaryStatistics doubleSummaryStatistics = listaEmpleados.stream()
                .collect(Collectors.summarizingDouble((e) -> e.getSalario()));
        
        System.out.println("Resumen estadistico del salario de Epleados: "+ doubleSummaryStatistics);
        
        // Uso del metodo teeing(), este metodo combina dos salidas de Collectors usando
        // una funcion especial de combinacion.
        List<Integer> intList = new ArrayList<>();
        IntStream.range(1, 100).forEach((i) -> intList.add(i));
        Double promedio = intList.stream().collect(Collectors.teeing(
                Collectors.summingDouble((i) -> i), 
                Collectors.counting(), (sum, n) -> sum / n));
        
        System.out.println("Promedio de los 1ros 100 numeros: "+ promedio);
    }
}
