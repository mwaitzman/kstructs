/*
LGPL v3.0
Copyright (C) 2019 Pedro Agullo Soliveres
p.agullo.soliveres@gmail.com

KStructs is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 3 of the License, or (at your option) any later version.

KStructs is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program; if not, write to the Free Software Foundation,
Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

package com.softwarementors.kstructs.util

fun roundUp( v : Long, divisor : Long) : Long {
   if( v == 0L ) {
      return 0L
   }
   else {
      var quotient = v / divisor
      val remainder = v % divisor
      if( remainder > 0 ) {
         quotient ++
      }
      return divisor * quotient
   }
}
   


