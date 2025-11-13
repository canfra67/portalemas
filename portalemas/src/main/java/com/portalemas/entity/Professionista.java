package com.portalemas.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Professionisti")
public class Professionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfessionista;

    @OneToOne
    @JoinColumn(name = "idUtente", referencedColumnName = "id", nullable = false)
    private User utente;

    @Column(length = 40)
    private String cognome;

    @Column(length = 40)
    private String nome;

    @Column(length = 100)
    private String indirizzo;

    @Column(length = 50)
    private String comune;

    @Column(length = 4)
    private String provincia;

    @Column(length = 5)
    private String cap;

    @Column(length = 16)
    private String codiceFiscale;

    @Column(length = 11)
    private String partitaIVA;

    @Column(length = 10)
    private String codiceDestinatario;

    @Column(length = 30)
    private String pec;

    @Column(length = 30)
    private String email;

    @Column(length = 20)
    private String cellulare;

    @Column(length = 30)
    private String tipologia;

    private Boolean stato;

    private LocalDateTime dataCreazione;

    private LocalDate dataTermine;

    @Column(length = 30)
    private String pubNikName;

    @Column(length = 20)
    private String pubCellulare;

    private Boolean pubWhatsapp;

    @Column(length = 30)
    private String pubUtenteTelegram;

    @Column(length = 50)
    private String pubSitoWeb;

    @Column(length = 30)
    private String pubEmail;

    // Getters e Setters
    public Integer getIdProfessionista() { return idProfessionista; }
    public void setIdProfessionista(Integer idProfessionista) { this.idProfessionista = idProfessionista; }

    public User getUtente() { return utente; }
    public void setUtente(User utente) { this.utente = utente; }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getIndirizzo() { return indirizzo; }
    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }

    public String getComune() { return comune; }
    public void setComune(String comune) { this.comune = comune; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getCap() { return cap; }
    public void setCap(String cap) { this.cap = cap; }

    public String getCodiceFiscale() { return codiceFiscale; }
    public void setCodiceFiscale(String codiceFiscale) { this.codiceFiscale = codiceFiscale; }

    public String getPartitaIVA() { return partitaIVA; }
    public void setPartitaIVA(String partitaIVA) { this.partitaIVA = partitaIVA; }

    public String getCodiceDestinatario() { return codiceDestinatario; }
    public void setCodiceDestinatario(String codiceDestinatario) { this.codiceDestinatario = codiceDestinatario; }

    public String getPec() { return pec; }
    public void setPec(String pec) { this.pec = pec; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCellulare() { return cellulare; }
    public void setCellulare(String cellulare) { this.cellulare = cellulare; }

    public String getTipologia() { return tipologia; }
    public void setTipologia(String tipologia) { this.tipologia = tipologia; }

    public Boolean getStato() { return stato; }
    public void setStato(Boolean stato) { this.stato = stato; }

    public LocalDateTime getDataCreazione() { return dataCreazione; }
    public void setDataCreazione(LocalDateTime dataCreazione) { this.dataCreazione = dataCreazione; }

    public LocalDate getDataTermine() { return dataTermine; }
    public void setDataTermine(LocalDate dataTermine) { this.dataTermine = dataTermine; }

    public String getPubNikName() { return pubNikName; }
    public void setPubNikName(String pubNikName) { this.pubNikName = pubNikName; }

    public String getPubCellulare() { return pubCellulare; }
    public void setPubCellulare(String pubCellulare) { this.pubCellulare = pubCellulare; }

    public Boolean getPubWhatsapp() { return pubWhatsapp; }
    public void setPubWhatsapp(Boolean pubWhatsapp) { this.pubWhatsapp = pubWhatsapp; }

    public String getPubUtenteTelegram() { return pubUtenteTelegram; }
    public void setPubUtenteTelegram(String pubUtenteTelegram) { this.pubUtenteTelegram = pubUtenteTelegram; }

    public String getPubSitoWeb() { return pubSitoWeb; }
    public void setPubSitoWeb(String pubSitoWeb) { this.pubSitoWeb = pubSitoWeb; }

    public String getPubEmail() { return pubEmail; }
    public void setPubEmail(String pubEmail) { this.pubEmail = pubEmail; }
}
	