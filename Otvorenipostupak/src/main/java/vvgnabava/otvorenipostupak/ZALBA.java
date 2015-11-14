package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ZALBA")
@org.kie.api.definition.type.Description("Evidencija pristiglih zalbi")
public class ZALBA implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("id_zalba")
   private java.lang.Integer id_zalba;
   @org.kie.api.definition.type.Label("datum_zalbe")
   private java.util.Date datum_zalbe;

   @org.kie.api.definition.type.Label("Opis")
   private java.lang.String opis;

   @org.kie.api.definition.type.Label("ebn")
   private java.lang.String ebn;

   @org.kie.api.definition.type.Label(value = "pojasnjenje")
   private java.lang.Boolean pojasnjenje;

   @org.kie.api.definition.type.Label(value = "dokumentacija_zal")
   private java.lang.Boolean dokumentacija_zal;

   public ZALBA()
   {
   }

   public java.lang.Integer getId_zalba()
   {
      return this.id_zalba;
   }

   public void setId_zalba(java.lang.Integer id_zalba)
   {
      this.id_zalba = id_zalba;
   }

   public java.util.Date getDatum_zalbe()
   {
      return this.datum_zalbe;
   }

   public void setDatum_zalbe(java.util.Date datum_zalbe)
   {
      this.datum_zalbe = datum_zalbe;
   }

   public java.lang.String getOpis()
   {
      return this.opis;
   }

   public void setOpis(java.lang.String opis)
   {
      this.opis = opis;
   }

   public java.lang.String getEbn()
   {
      return this.ebn;
   }

   public void setEbn(java.lang.String ebn)
   {
      this.ebn = ebn;
   }

   public java.lang.Boolean getPojasnjenje()
   {
      return this.pojasnjenje;
   }

   public void setPojasnjenje(java.lang.Boolean pojasnjenje)
   {
      this.pojasnjenje = pojasnjenje;
   }

   public java.lang.Boolean getDokumentacija_zal()
   {
      return this.dokumentacija_zal;
   }

   public void setDokumentacija_zal(java.lang.Boolean dokumentacija_zal)
   {
      this.dokumentacija_zal = dokumentacija_zal;
   }

   public ZALBA(java.lang.Integer id_zalba, java.util.Date datum_zalbe,
         java.lang.String opis, java.lang.String ebn,
         java.lang.Boolean pojasnjenje, java.lang.Boolean dokumentacija_zal)
   {
      this.id_zalba = id_zalba;
      this.datum_zalbe = datum_zalbe;
      this.opis = opis;
      this.ebn = ebn;
      this.pojasnjenje = pojasnjenje;
      this.dokumentacija_zal = dokumentacija_zal;
   }

}