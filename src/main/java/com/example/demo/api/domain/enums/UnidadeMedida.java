package com.example.demo.api.domain.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UnidadeMedida {
    METRO_QUADRADO("M2", "Metro Quadrado"),
    METRO_CUBICO("M3", "Metro Cúbico"),
    QUILOGRAMA("KG", "Quilograma"),
    TONELADA("TN", "Tonelada"),
    UNIDADE("UN", "Unidade"),
    PAR("PAR", "Par"),
    CAIXA("CX", "Caixa"),
    MILHEIRO("MIL", "Milheiro"),
    LITRO("LT", "Litro"),
    METRO("MT", "Metro"),
    GARRAFA("GF", "Garrafa"),
    GRAMA("GR", "Grama"),
    MILILITRO("ML", "Mililitro"),
    PESO_LIQUIDO("PL", "Peso Líquido"),
    PESO_BRUTO("PB", "Peso Bruto"),
    ROLO("ROL", "Rolo"),
    MILIMETRO("MM", "Milímetro"),
    CENTIMETRO("CM", "Centímetro"),
    MILIGRAMA("MG", "Miligrama"),
    BARRIL("BRR", "Barril"),
    FOLHA("FL", "Folha"),
    CONJUNTO("CJ", "Conjunto"),
    SACO("SC", "Saco"),
    PACOTE("PC", "Pacote"),
    FARDO("FD", "Fardo"),
    DZ("DZ", "Dúzia"),
    BLOCO("BL", "Bloco"),
    BANDEJA("BDJ", "Bandeja"),
    BOBINA("BB", "Bobina"),
    TAMBOR("TB", "Tambor"),
    ENFARDADEIRA("EFR", "Enfardadeira"),
    SACARIA("SR", "Sacaria"),
    PECA("PCA", "Peça"),
    TANQUE("TNQ", "Tanque"),
    FRASCO("FR", "Frasco"),
    DUZIA("DZ", "Dúzia"),
    JOGO("JG", "Jogo"),
    LATA("LT", "Lata"),
    MANGA("MG", "Manga"),
    SACOLA("SAC", "Sacola"),
    TUBO("TUB", "Tubo"),
    VIDRO("VD", "Vidro"),
    POTE("PT", "Pote"),
    BANHEIRA("BH", "Banheira"),
    CARTELA("CTL", "Cartela"),
    KIT("KIT", "Kit"),
    BOMBONA("BON", "Bombona"),
    FOLHETO("FLH", "Folheto"),
    FITA("FT", "Fita"),
    VASILHAME("VAS", "Vasilhame"),
    ROLO_2("RL", "Rolo");

    private final String sigla;
    private final String descricao;

    public static UnidadeMedida fromSigla(String sigla) {
        for (UnidadeMedida unidade : UnidadeMedida.values()) {
            if (unidade.getSigla().equalsIgnoreCase(sigla)) {
                return unidade;
            }
        }
        throw new IllegalArgumentException("Sigla de unidade de medida inválida: " + sigla);
    }
}

@Converter(autoApply = true)
class UnidadeMedidaConverter implements AttributeConverter<UnidadeMedida, String> {

    @Override
    public String convertToDatabaseColumn(UnidadeMedida unidade) {
        if (unidade == null) {
            return null;
        }
        return unidade.getSigla();
    }

    @Override
    public UnidadeMedida convertToEntityAttribute(String sigla) {
        if (sigla == null) {
            return null;
        }
        return UnidadeMedida.fromSigla(sigla);
    }
}