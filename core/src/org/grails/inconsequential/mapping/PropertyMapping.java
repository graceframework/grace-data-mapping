package org.grails.inconsequential.mapping;

/**
 * A marker interface for a property mapping which specifies
 * what or where a particular property is mapped to
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface PropertyMapping {

    /**
     * Retrieves the ClassMapping instance of the owning class
     *
     * @return The ClassMapping instance
     */
    ClassMapping getClassMapping();
}
