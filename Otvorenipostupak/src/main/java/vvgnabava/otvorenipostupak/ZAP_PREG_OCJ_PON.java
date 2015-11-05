package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ZAPISNIK O PREGLEDU I OCJENI PONUDA")
@org.kie.api.definition.type.Description("Izra?uje se nakon otvaranja ponuda.")
public class ZAP_PREG_OCJ_PON implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("id_zapisnika")
   private java.lang.Integer id_zapisnika;
   @org.kie.api.definition.type.Label("ebn")
   private java.lang.String ebn;
   @org.kie.api.definition.type.Label("datum")
   private java.util.Date datum;

   @org.kie.api.definition.type.Label(value = "opis")
   private java.lang.String opis;

   public ZAP_PREG_OCJ_PON()
   {
   }

   public java.lang.Integer getId_zapisnika()
   {
      return this.id_zapisnika;
   }

   public void setId_zapisnika(java.lang.Integer id_zapisnika)
   {
      this.id_zapisnika = id_zapisnika;
   }

   public java.lang.String getEbn()
   {
      return this.ebn;
   }

   public void setEbn(java.lang.String ebn)
   {
      this.ebn = ebn;
   }

   public java.util.Date getDatum()
   {
      return this.datum;
   }

   public void setDatum(java.util.Date datum)
   {
      this.datum = datum;
   }

   public java.lang.String getOpis()
   {
      return this.opis;
   }

   public void setOpis(java.lang.String opis)
   {
      this.opis = opis;
   }

   public ZAP_PREG_OCJ_PON(java.lang.Integer id_zapisnika, java.lang.String ebn,
         java.util.Date datum, java.lang.String opis)
   {
      this.id_zapisnika = id_zapisnika;
      this.ebn = ebn;
      this.datum = datum;
      this.opis = opis;
   }

}