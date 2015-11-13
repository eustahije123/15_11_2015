package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("POJASNJENJE_DOKUMENTACIJU")
@org.kie.api.definition.type.Description("Ako je u vremenu za prikupljanje ponuda pristigao zahtjev za pojašnjenjem dokumentacije izra?uje se pojašnjenje ukoliko je opravdano")
public class POJASNJENE_DOKUMENTACIJA implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("id_pojasnjenja")
   private java.lang.Integer id_pojasnjenja;
   @org.kie.api.definition.type.Label("ebn")
   private java.lang.String ebn;
   @org.kie.api.definition.type.Label("datum")
   private java.util.Date datum;
   @org.kie.api.definition.type.Label("ponuditelj")
   private java.lang.String ponuditelj;

   @org.kie.api.definition.type.Label(value = "pojasnjenje")
   private java.lang.String pojasnjenje;

   public POJASNJENE_DOKUMENTACIJA()
   {
   }

   public java.lang.Integer getId_pojasnjenja()
   {
      return this.id_pojasnjenja;
   }

   public void setId_pojasnjenja(java.lang.Integer id_pojasnjenja)
   {
      this.id_pojasnjenja = id_pojasnjenja;
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

   public java.lang.String getPonuditelj()
   {
      return this.ponuditelj;
   }

   public void setPonuditelj(java.lang.String ponuditelj)
   {
      this.ponuditelj = ponuditelj;
   }

   public java.lang.String getPojasnjenje()
   {
      return this.pojasnjenje;
   }

   public void setPojasnjenje(java.lang.String pojasnjenje)
   {
      this.pojasnjenje = pojasnjenje;
   }

   public POJASNJENE_DOKUMENTACIJA(java.lang.Integer id_pojasnjenja,
         java.lang.String ebn, java.util.Date datum,
         java.lang.String ponuditelj, java.lang.String pojasnjenje)
   {
      this.id_pojasnjenja = id_pojasnjenja;
      this.ebn = ebn;
      this.datum = datum;
      this.ponuditelj = ponuditelj;
      this.pojasnjenje = pojasnjenje;
   }

}