
@objects
    header                   css   .navigation.navigationBar
    header-logo              css   .tc-hdr__logo-image.loading
    menu                     css   .tc-hdr__nav__menu
    menu-item-*              css   .tc-hdr__nav__menu li a
    footer                   css    .footer-sitemap


= Header =
    @on *
        header:
            inside screen 0px top
            centered horizontally inside screen 1px
            

        header-logo:
            width 98px
            height 36px
            inside header 10 to 20px top


    @on desktop
        header:
            width  1310 to 1320px
            height ~ 70px


= Menu =

    @on desktop
        menu:
            right-of header-logo ~15px
            width 515px
            
        menu-item-1:
            inside menu 27px top
            inside menu 16px left
            inside menu 24px bottom

    @on tablet
        menu:
            below header-logo

        menu-item-1:
            inside menu 21px top
            inside menu 32px left
            inside menu 17px bottom           
            
    @on desktop, tablet
        menu-item-*:
            width 80 to 130px
            height ~ 18px
            inside menu  20 to 30px top

        @forEach [menu-item-*] as menuItem, prev as previousMenuItem
            ${menuItem}:
                right-of ${previousMenuItem} 27 to 35px
                aligned horizontally all ${previousMenuItem}


    @on mobile
        menu-item-* :
            width 100% of screen/width

        @for [ 1, 2,3 ] as index
            menu-item-${index}:
                above menu-item-${index+1} 0 to 5px





= Footer =
    footer:
        below header

