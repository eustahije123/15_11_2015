package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Description("Oznaka o zaprimanju ponude ili zalbe")
public class PonudaZalba implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "ID_ponudaZalba")
   private java.util.List<java.lang.Integer> ID_ponudaZalba;
   @org.kie.api.definition.type.Label(value = "NazivDobavljaca")
   private java.lang.String nazivDobavljaca;
   @org.kie.api.definition.type.Label(value = "Ponuda")
   private java.lang.Boolean ponuda;
   @org.kie.api.definition.type.Label(value = "Zalba")
   private java.lang.Boolean zalba;
   @org.kie.api.definition.type.Label(value = "DatumZaprimanja")
   private java.util.Date datumZaprimanja;

   public PonudaZalba()
   {
   }

   public java.util.List<java.lang.Integer> getID_ponudaZalba()
   {
      return this.ID_ponudaZalba;
   }

   public void setID_ponudaZalba(
         java.util.List<java.lang.Integer> ID_ponudaZalba)
   {
      this.ID_ponudaZalba = ID_ponudaZalba;
   }

   public java.lang.String getNazivDobavljaca()
   {
      return this.nazivDobavljaca;
   }

   public void setNazivDobavljaca(java.lang.String nazivDobavljaca)
   {
      this.nazivDobavljaca = nazivDobavljaca;
   }

   public java.lang.Boolean getPonuda()
   {
      return this.ponuda;
   }

   public void setPonuda(java.lang.Boolean ponuda)
   {
      this.ponuda = ponuda;
   }

   public java.lang.Boolean getZalba()
   {
      return this.zalba;
   }

   public void setZalba(java.lang.Boolean zalba)
   {
      this.zalba = zalba;
   }

   public java.util.Date getDatumZaprimanja()
   {
      return this.datumZaprimanja;
   }

   public void setDatumZaprimanja(java.util.Date datumZaprimanja)
   {
      this.datumZaprimanja = datumZaprimanja;
   }

   public PonudaZalba(java.util.List<java.lang.Integer> ID_ponudaZalba,
         java.lang.String nazivDobavljaca, java.lang.Boolean ponuda,
         java.lang.Boolean zalba, java.util.Date datumZaprimanja)
   {
      this.ID_ponudaZalba = ID_ponudaZalba;
      this.nazivDobavljaca = nazivDobavljaca;
      this.ponuda = ponuda;
      this.zalba = zalba;
      this.datumZaprimanja = datumZaprimanja;
   }

}