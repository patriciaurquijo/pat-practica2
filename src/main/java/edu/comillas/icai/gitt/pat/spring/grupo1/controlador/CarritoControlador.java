package edu.comillas.icai.gitt.pat.spring.grupo1.controlador;

import edu.comillas.icai.gitt.pat.spring.grupo1.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    //Get carrito
    @GetMapping("/api/carrito")
    public Collection<Carrito> getCarritos() {
        return carritos.values();
    }

    //post de carrito

    @PostMapping("/api/carrito")
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito creaCarrito(@RequestBody Carrito carrito) {
        carritos.put(carrito.getIdCarrito(), carrito);
        return carrito;
    } //mapea a un formato JSON las propiedades de carrito

    @GetMapping("/api/carrito/{idCarrito}")
    public Carrito getCarrito(@PathVariable int idCarrito) {
      return carritos.get(idCarrito);
    }

    //borrar un carrito
    @DeleteMapping("/api/carrito/{idCarrito}")
    public void borrarCarrito(@PathVariable int idCarrito) {
        carritos.remove(idCarrito);
    }

    //Put
    @PutMapping("/api/carrito/{idCarrito}")
    public Carrito modificarCarrito(@PathVariable int idCarrito, @RequestBody Carrito carrito){
        carritos.put(idCarrito, carrito);
        return carrito;
    }


    //@GetMapping("/api/contadores/{nombre}")
    //public ModeloContador contador(@PathVariable String nombre) {
    //  return contadores.get(nombre);
    //}

    //@PutMapping("/api/contadores/{nombre}/incremento/{incremento}")
    //public ModeloContador incrementa(@PathVariable String nombre,
    //                                @PathVariable Integer incremento) {
    //    ModeloContador contadorActual = contadores.get(nombre);
    //    ModeloContador contadorIncrementado =
    //            new ModeloContador(nombre, contadorActual.valor() + incremento);
    //    contadores.put(nombre, contadorIncrementado);
    //    return contadorIncrementado;
    //}
}

