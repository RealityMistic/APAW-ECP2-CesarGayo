package es.upm.miw.apaw.ecp2.dtos;

import java.time.LocalDateTime;

public class ConciertoDto {

        private LocalDateTime fecha;

        private String nombre;

        private double precio;

        public ConciertoDto(LocalDateTime fecha, String nombre, double precio) {
            this.fecha = fecha;
            this.nombre = nombre;
            this.precio=precio;
        }

        public Boolean getFecha() {
            return fecha;
        }

        public void setFecha(Boolean fecha) {
            this.fecha = fecha;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }



        @Override
        public String toString() {
            return "ConciertoDto{" +
                    "momento=" + fecha.toString() +
                    ", nombre='" + nombre + '\'' +
                    ", precio='" + Double.toString(precio) +'}';
        }
    }

}
