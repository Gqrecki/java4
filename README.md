MAIN
Hibernate: 
    insert 
    into
        triangles
        (a,b,c,alpha,blue,green,red) 
    values
        (?,?,?,?,?,?,?)
Hibernate: 
    insert 
    into
        rectangles
        (alpha,blue,green,red,height,width) 
    values
        (?,?,?,?,?,?)
Hibernate: 
    select
        r1_0.id,
        r1_0.alpha,
        r1_0.blue,
        r1_0.green,
        r1_0.red,
        r1_0.height,
        r1_0.width 
    from
        rectangles r1_0
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.alpha,
        t1_0.blue,
        t1_0.green,
        t1_0.red 
    from
        triangles t1_0
Rectangle ID=1 - W: 5.0 H: 10.0 - Color: R: 5, G: 6, B: 7, A: 8
Triangle ID=1 - A: 3.0 B: 4.0 C: 5.0 - Color: R: 1, G: 2, B: 3, A: 4
Hibernate: 
    drop table if exists rectangles cascade
Hibernate: 
    drop table if exists triangles cascade




TEST
Hibernate: 
    drop table if exists rectangles cascade
Hibernate: 
    drop table if exists triangles cascade
Hibernate: 
    create table rectangles (
        alpha integer not null,
        blue integer not null,
        green integer not null,
        height float(53) not null,
        red integer not null,
        width float(53) not null,
        id bigserial not null,
        primary key (id)
    )
Hibernate: 
    create table triangles (
        a float(53) not null,
        alpha integer not null,
        b float(53) not null,
        blue integer not null,
        c float(53) not null,
        green integer not null,
        red integer not null,
        id bigserial not null,
        primary key (id)
    )
Hibernate: 
Hibernate: 
    insert 
    into
        rectangles
        (alpha,blue,green,red,height,width) 
    values
        (?,?,?,?,?,?)
Hibernate: 
    select
        r1_0.id,
        r1_0.alpha,
        r1_0.blue,
        r1_0.green,
        r1_0.red,
        r1_0.height,
        r1_0.width 
    from
        rectangles r1_0
Hibernate: 
    insert 
    into
        triangles
        (a,b,c,alpha,blue,green,red) 
    values
        (?,?,?,?,?,?,?)
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.alpha,
        t1_0.blue,
        t1_0.green,
        t1_0.red 
    from
        triangles t1_0
Hibernate: 
    drop table if exists rectangles cascade
Hibernate: 
    drop table if exists triangles cascade
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.085 s -- in lab4.ShapeDAOTest
