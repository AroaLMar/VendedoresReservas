package com.example.VendedoresReservas.Controllers;

import com.example.VendedoresReservas.Entities.concesionario;
import com.example.VendedoresReservas.Entities.vendedor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;


    @RestController
    public class VendedorController {

        @PostMapping("/api/vendedores")
        public void aniadirVendedor(@Valid @RequestBody vendedor vend) {
            concesionario.aniadirVendedor(vend);
        }

        @PutMapping("/api/vendedores/{codven}")
        public void modificarVendedor(@PathVariable String codven, @Valid @RequestBody VendedorUpdate vendedor) {
           concesionario.modificarVendedor(codven,vendedor.getNombre(),vendedor.getNombre(),vendedor.getTelefono());
        }

        @DeleteMapping("/api/vendedores/{codven}")
        public void borrarVendedor(@PathVariable String codven) {
            concesionario.borrarVendedor(codven);
        }

        @GetMapping("/api/vendedores")
        public ResponseEntity<ArrayList<vendedor>> getVendedores() {
            return ResponseEntity.ok(concesionario.visualizarVendedores());

        }
    }


