package com.SpringBoot.JunitTest.PackajeUsoUnitTests;

public class NotificadorEmail {
    private EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        if (direccion == null || direccion.isEmpty()) {
            return; // No se envía el correo si la dirección es nula o vacía
        }
        if (mensaje == null) {
            mensaje = ""; // Si el mensaje es nulo, se establece como una cadena vacía
        }
        emailCliente.enviarCorreo(direccion, mensaje);
    }
}
