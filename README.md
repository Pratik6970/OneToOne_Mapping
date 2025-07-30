Hibernate One-to-One Mapping Tutorial
This project demonstrates how to implement a One-to-One relationship between two entities using Hibernate ORM.

Overview
In a One-to-One mapping, each record in one table corresponds to exactly one record in another table. For example, a Student can have exactly one Mobile device associated with them.

Entities
Student: Represents a student with attributes like id, name, and a reference to a Mobile.

Mobile: Represents a mobile device with attributes like mobileId and mobileName.

Mapping Details
The Student entity owns the relationship and holds a foreign key column (m_id) that references the Mobile entity.

The relationship is annotated with @OneToOne and @JoinColumn to specify the foreign key.

The Mobile entity is a simple entity with its own primary key.

How It Works
When a Student is saved, the associated Mobile entity is saved separately.

The Student table contains a foreign key column (m_id) linking it to the Mobile table.

Hibernate manages this association transparently.

Benefits of One-to-One Mapping
Maintains data integrity by enforcing a strict one-to-one link.

Avoids redundancy by separating related data into distinct tables.

Useful when one entity logically "owns" or "controls" the other.
