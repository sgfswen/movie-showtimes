<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="UTF-8" />
    <xsl:param name="movieId"/>
    <xsl:template match="/">   
        <div id="theater-list">
            <xsl:variable name="theaters" select="//movie[id=$movieId]/sessions/session/theater" />
            <xsl:for-each select="$theaters">
                <!-- Remove duplicate condition: http://stackoverflow.com/a/22816973/1420186 -->
                <xsl:if test="generate-id() = generate-id($theaters[. = current()][1])">
                <div class="movie" data-id="{id}" tabindex="0"> 
                    <a href="?action=movie&amp;movie={$movieId}&amp;theater={id}">
                        <img class="movie-poster" src="{image}" />
                        <h3>
                            <xsl:value-of select="name"/>
                        </h3>
                        <div class="description">
                            <span>Địa chỉ:</span>
                            <xsl:value-of select="address"/>
                        </div>         
                    </a>                      
                </div>
                </xsl:if>
            </xsl:for-each>       
        </div>
    </xsl:template>
</xsl:stylesheet>