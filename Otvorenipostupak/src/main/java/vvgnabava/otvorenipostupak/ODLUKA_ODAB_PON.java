package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ODLUKA_ODAB_PON")
public class ODLUKA_ODAB_PON implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id_odluka_odab_pon")
   private java.lang.Integer id_odluka_odab_pon;
   @org.kie.api.definition.type.Label(value = "ebn")
   private java.lang.String ebn;
   @org.kie.api.definition.type.Label(value = "datum")
   private java.util.Date datum;
   @org.kie.api.definition.type.Label(value = "odabir")
   private java.lang.Boolean odabi;
   @org.kie.api.definition.type.Label(value = "ponistenje")
   private java.lang.Boolean ponistenje;

   public ODLUKA_ODAB_PON()
   {
   }

   public java.lang.Integer getId_odluka_odab_pon()
   {
      return this.id_odluka_odab_pon;
   }

   public void setId_odluka_odab_pon(java.lang.Integer id_odluka_odab_pon)
   {
      this.id_odluka_odab_pon = id_odluka_odab_pon;
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

   public java.lang.Boolean getOdabi()
   {
      return this.odabi;
   }

   public void setOdabi(java.lang.Boolean odabi)
   {
      this.odabi = odabi;
   }

   public java.lang.Boolean getPonistenje()
   {
      return this.ponistenje;
   }

   public void setPonistenje(java.lang.Boolean ponistenje)
   {
      this.ponistenje = ponistenje;
   }

   public ODLUKA_ODAB_PON(java.lang.Integer id_odluka_odab_pon,
         java.lang.String ebn, java.util.Date datum,
         java.lang.Boolean odabi, java.lang.Boolean ponistenje)
   {
      this.id_odluka_odab_pon = id_odluka_odab_pon;
      this.ebn = ebn;
      this.datum = datum;
      this.odabi = odabi;
      this.ponistenje = ponistenje;
   }

}