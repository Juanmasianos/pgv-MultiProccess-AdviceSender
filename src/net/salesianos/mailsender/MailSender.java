package net.salesianos.mailsender;

import java.time.LocalDateTime;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailSender {
    public static void main(String[] args) {

        if (args.length <= 0) {
            System.out.println("No se han encontrado argumentos, finalizando proceso.");
            System.exit(0);
        }

        final String RECIPIENT_USER = args[0];
        final String RECIPIENT_EMAIL = args[1];
        final String RECIPIENT_SUBJECT = args[2];
        final String RECIPIENT_PERCENTAGE = args[3];

        final String SENDER_USER = "micorreitocorreocorreazo@gmail.com";

        final String PASSWORD_APLICACION = "Micontraseñitacontraseñacontraseñaca";

        final String HOST_SMTP = "smtp.gmail.com";
        final String PUERTO_SMTP = "587";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable", "true"); 
        props.put("mail.smtp.host", HOST_SMTP);
        props.put("mail.smtp.port", PUERTO_SMTP);

        Session session = Session.getInstance(props, new Authenticator() {
            
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SENDER_USER, PASSWORD_APLICACION);
            }
            
        });


        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(SENDER_USER));

            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(RECIPIENT_EMAIL));

            message.setSubject("Aviso faltas en la asignatura " + RECIPIENT_SUBJECT.toUpperCase());

            message.setText(
                    "Querido/a " + RECIPIENT_USER + ", se te avisa de que has faltado a un " + 
                                RECIPIENT_PERCENTAGE + " de las clases de " + RECIPIENT_SUBJECT.toUpperCase(),
                    "UTF-8", "plain");

            Transport.send(message);

            System.out.println("Correo enviado con éxito a " + RECIPIENT_USER + " a las " + LocalDateTime.now());

        } catch (Exception e) {
            System.out.println("Error al enviar el correo.");
            System.out.println(e);
        }

    }
}
